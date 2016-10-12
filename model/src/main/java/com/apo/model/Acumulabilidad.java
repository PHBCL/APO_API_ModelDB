package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACUMULABILIDAD")
public class Acumulabilidad {

	
	@Id
	@Column(name="COD_ACUMULABILIDAD")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAcumulabilidad")
	@javax.persistence.SequenceGenerator(name="seqAcumulabilidad", sequenceName = "SEQ_ACUMULABILIDAD", allocationSize = 1)
	private int codAcumulabilidad;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="AB_MOTOR")
	private String abMotor;
	
	
	public Acumulabilidad(){}
	public Acumulabilidad(String nombre, String abMotor){
		this.nombre = nombre;
		this.abMotor = abMotor;
	}
	
	
	
	public int getCodAcumulabilidad() {
		return codAcumulabilidad;
	}
	public void setCodAcumulabilidad(int codAcumulabilidad) {
		this.codAcumulabilidad = codAcumulabilidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbMotor() {
		return abMotor;
	}
	public void setAbMotor(String abMotor) {
		this.abMotor = abMotor;
	}
	
	
}
