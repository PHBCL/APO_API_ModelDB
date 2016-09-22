package com.apo.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "REGLA_PROMOCION")
public class ReglaPromocion {
	
	@Id
	@Column(name="CODREGLAPROM")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqConfiguraconPlant")
	@javax.persistence.SequenceGenerator(name="seqConfiguraconPlant", sequenceName = "SEQ_REGLA_PROMOCION", allocationSize = 1)
	private int codReglaProm;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

	public ReglaPromocion(){}
	
	public ReglaPromocion(String nombre, String descripcion){
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getCodReglaProm() {
		return codReglaProm;
	}

	public void setCodReglaProm(int codReglaProm) {
		this.codReglaProm = codReglaProm;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
