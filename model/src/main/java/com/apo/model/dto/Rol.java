package com.apo.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rol")
public class Rol {

	@Id
	@Column(name="COD_ROL")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqRol")
	@javax.persistence.SequenceGenerator(name="seqRol", sequenceName = "SEQ_ROL")
	private int codRol;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	
	private Rol(){}
	private Rol(String nombre){
		this.nombre = nombre;
	}
	
	public int getCodRol() {
		return codRol;
	}
	public void setCodRol(int codRol) {
		this.codRol = codRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
