package com.apo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PROMOCION_HISTORICO")
public class PromocionHistorico {

	@Id
	@Column(name="COD_PROMOCION")
	private int codPromocion;
	
	@Column(name="NOMBRE_PROMOCION")
	private String nombre;
	
	@Column(name="OBJETIVO")
	private String objetivo;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="FECHA_INICIO", columnDefinition="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "MMM dd, yyyy HH:mm:ss a")
	private Date fechaInicio;
	
	@Column(name="FECHA_TERMINO", columnDefinition="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "MMM dd, yyyy HH:mm:ss a")
	private Date fechaTermino;
	
	@OneToOne
	@JoinColumn(name="COD_CAMPANA")
	private Campana campana;

	@OneToOne
	@JoinColumn(name="COD_USUARIO")
	private Usuario usuarioCreador;
	
	@OneToOne
	@JoinColumn(name="COD_PLANTILLA")
	private Plantilla plantilla;
	
	@OneToOne
	@JoinColumn(name="COD_PRORRATEO")
	private Prorrateo prorrateo;
	
	@OneToOne
	@JoinColumn(name="COD_ACUMULABILIDAD")
	private Acumulabilidad acumulabilidad;
	
	public PromocionHistorico(){}
	
	public PromocionHistorico(int codPromocion,String nombre,String objetivo,
					 Campana campania, Usuario usuario, 
					 Date fechaInicio,Date fechaTermino,
					 String estado,Plantilla plantilla,
					 Acumulabilidad acumulabilidad,Prorrateo prorrateo){
		this.codPromocion = codPromocion;
		this.campana = campania;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.nombre = nombre;
		this.objetivo = objetivo;
		this.usuarioCreador = usuario;
		this.estado = estado;
		this.plantilla = plantilla;
		this.acumulabilidad = acumulabilidad;
		this.prorrateo = prorrateo;
	}
	
		

	public int getCodPromocion() {
		return codPromocion;
	}

	public void setCodPromocion(int codPromocion) {
		this.codPromocion = codPromocion;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public Campana getCampana() {
		return campana;
	}

	public void setCampana(Campana campana) {
		this.campana = campana;
	}

	public Usuario getUsuarioCreador() {
		return usuarioCreador;
	}

	public void setUsuarioCreador(Usuario usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}

	public Plantilla getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(Plantilla plantilla) {
		this.plantilla = plantilla;
	}

	public Prorrateo getProrrateo() {
		return prorrateo;
	}

	public void setProrrateo(Prorrateo prorrateo) {
		this.prorrateo = prorrateo;
	}

	public Acumulabilidad getAcumulabilidad() {
		return acumulabilidad;
	}

	public void setAcumulabilidad(Acumulabilidad acumulabilidad) {
		this.acumulabilidad = acumulabilidad;
	}
	
	
}
