package com.xyz.gestorincidenciasxyz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xyz.gestorincidenciasxyz.entity.Incidencia;

@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Integer>
{
	
	@Query("SELECT i FROM Incidencia i WHERE i.idOperador = :idOperador")
    List<Incidencia> findByOperadorId(@Param("idOperador") Integer idOperador);
}
