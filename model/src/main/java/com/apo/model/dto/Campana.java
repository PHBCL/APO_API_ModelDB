package com.apo.model.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CAMPANA")
public class Campana {

	
	@Id
	@Column(name="COD_CAMPANA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "confPlantillaSeq")
	@javax.persistence.SequenceGenerator(name="confPlantillaSeq", sequenceName = "SEQ_CONFIGURACION_PLANTILLA", allocationSize = 1)
	private int codCampania;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	
	@Column(name="FECHA_INICIO", columnDefinition="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "MMM dd, yyyy HH:mm:ss a")
	private Date fechaInicio;
	
	
	@Column(name="FECHA_TERMINO", columnDefinition="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "MMM dd, yyyy HH:mm:ss a")
	private Date fechaTermino;
	
	@Column(name="esPERMANENTE")
	private String esPermanente;

	@OneToOne
	@JoinColumn(name="USUARIO_CREADOR")
	private Usuario usuarioCreador;

	
	public Campana(){}
	
	public Campana(String nombre,String descripcion,Date fechaInicio, Date fechaTermino, String esPermanente,Usuario usuario){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio =  fechaInicio;
		this.fechaTermino =  fechaTermino;
		this.esPermanente = esPermanente;
		this.usuarioCreador = usuario;
	}
	
	

	public int getCodCampania() {
		return codCampania;
	}

	public void setCodCampania(int codCampania) {
		this.codCampania = codCampania;
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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public String getEsPermanente() {
		return esPermanente;
	}

	public void setEsPermanente(String esPermanente) {
		this.esPermanente = esPermanente;
	}

	public Usuario getUsuarioCreador() {
		return usuarioCreador;
	}

	public void setUsuarioCreador(Usuario usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}
	
	
	
	
}
