package com.apo.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Tables;

@Entity
@Table(name = "JERARQUIA")
public class Jerarquia {
	
	@Id
	@Column(name="COD_JERARQUIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMarca")
	@javax.persistence.SequenceGenerator(name="seqMarca", sequenceName = "SEQ_MARCA", allocationSize = 1)
	int codJerarquia; 
	
	@Column(name="NOMBRE")
	String nombre;
	
	@Column(name="NIVEL")
	int nivel;
	
	@OneToOne
	@JoinColumn(name="COD_PADRE", nullable = true)
	private Jerarquia jerarquia;
	
	@OneToOne
	@JoinColumn(name="COD_USUARIO", nullable = true)
	private Usuario usuario;

	public Jerarquia(){}
	
	public Jerarquia (String nombre, int nivel, Jerarquia jerarquia,Usuario usuario){
		this.nombre = nombre;
		this.nivel = nivel;
		this.jerarquia = jerarquia;
		this.usuario = usuario;
	}
	
	
	public int getCodJerarquia() {
		return codJerarquia;
	}

	public void setCodJerarquia(int codJerarquia) {
		this.codJerarquia = codJerarquia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Jerarquia getJerarquia() {
		return jerarquia;
	}

	public void setJerarquia(Jerarquia jerarquia) {
		this.jerarquia = jerarquia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	   
	   
}
