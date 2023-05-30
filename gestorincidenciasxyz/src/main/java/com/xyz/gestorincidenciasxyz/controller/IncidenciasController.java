package com.xyz.gestorincidenciasxyz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.gestorincidenciasxyz.entity.Incidencia;
import com.xyz.gestorincidenciasxyz.entity.Operador;
import com.xyz.gestorincidenciasxyz.repository.IncidenciaRepository;
import com.xyz.gestorincidenciasxyz.repository.OperadorRepository;

@RestController
@RequestMapping("/api")
public class IncidenciasController {
	
	
	@Autowired
	private IncidenciaRepository incidenciaRepo;
	
	
	@Autowired
	private OperadorRepository opRepository;
	
	
	
	@GetMapping("/incidencias/{id}")
	public Incidencia getIncidenciaById(@PathVariable Integer id) {
		return this.incidenciaRepo.findById(id).orElse(null);
	}
	
	
	@GetMapping("/incidecnias/oporador/{idOperador}")
	public List<Incidencia> getIncidenciaByOperadorId(@PathVariable Integer idOperador){
		return this.incidenciaRepo.findByOperadorId(idOperador);
	}
	
	@PostMapping("/incidencias")
	public Incidencia addIncidencia(@RequestBody Incidencia incidencia) {
		return this.incidenciaRepo.save(incidencia);
	}
	
	@PostMapping("/operador")
	public Operador addOperador(@RequestBody Operador operador) {
		return this.opRepository.save(operador);
	}
	
	
	@GetMapping("/operadores")
	public List<Incidencia> getIncidenciaById() {
		return  this.incidenciaRepo.findAll();
	}
	
	
	
	

}
