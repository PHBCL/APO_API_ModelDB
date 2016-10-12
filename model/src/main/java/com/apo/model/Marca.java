package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "MARCA")
public class Marca {

	@Id
	@Column(name="COD_MARCA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMarca")
	@javax.persistence.SequenceGenerator(name="seqMarca", sequenceName = "SEQ_MARCA", allocationSize = 1)
	private int codMarca;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	public Marca(){}
	
	public Marca(int codMarca,String nombre){
		this.codMarca = codMarca;
		this.nombre = nombre;
	}
	
	public Marca(String nombre){
		this.nombre = nombre;
	}
	
	

	public int getCodMarca() {
		return codMarca;
	}

	public void setCodMarca(int codMarca) {
		this.codMarca = codMarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
