package com.xyz.gestorincidenciasxyz.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="incidencia")
public class Incidencia {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idIncidencia;

	
	private Integer idOperador;
	
	
	private String descripcion;
	private Date fecha;
	private String estado;
	public int getIdIncidencia() {
		return idIncidencia;
	}
	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}
	public int getOperador() {
		return idOperador;
	}
	public void setOperador(int idOperador) {
		this.idOperador = idOperador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
