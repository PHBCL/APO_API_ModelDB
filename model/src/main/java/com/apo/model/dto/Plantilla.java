package com.apo.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLANTILLA")
public class Plantilla {

	@Id
	@Column(name="COD_PLANTILLA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "confSeqPlantilla")
	@javax.persistence.SequenceGenerator(name="confSeqPlantilla", sequenceName = "SEQ_PLANTILLA", allocationSize = 1)
	private int codPlantilla;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="OBJETIVO")
	private String objetivo;
	
	@Column(name="IMG")
	private String img;

	public Plantilla(){}
	public Plantilla(String nombre, String objetivo,String img){
		this.nombre = nombre;
		this.objetivo = objetivo;
		this.img = img;
	}
	
	
	
	public int getCodPlantilla() {
		return codPlantilla;
	}

	public void setCodPlantilla(int codPlantilla) {
		this.codPlantilla = codPlantilla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
