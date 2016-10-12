package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "ACCESO")
public class Acceso {

	@Id
	@Column(name="COD_ACCESO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAcceso")
	@javax.persistence.SequenceGenerator(name="seqAcceso", sequenceName = "SEQ_ACCESO", allocationSize = 1)
	private int codAcceso;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="URL")
	private String url;
	
	@Column(name="COD_PADRE")
	private Integer codPadre;
	
	@Column(name="esPadre")
	private boolean esPadre;
	
	@Column(name="ORDEN")
	private int orden;
	
	@Column(name="ESSUBSCRIPCION")
	private int esSubscripcion;
	
	@Column(name="VISIBLE")
	private int visible;

	
	
	public Acceso(){}
	public Acceso(String nombre,String url,Integer codPadre,boolean esPadre, int orden, int esSubscripcion){
		this.nombre = nombre;
		this.url = url;
		if(esPadre){
			this.codPadre = codPadre;
		}
		this.esPadre = esPadre;
		this.orden = orden;
		this.esSubscripcion = esSubscripcion;
	}
	public int getCodAcceso() {
		return codAcceso;
	}
	public void setCodAcceso(int codAcceso) {
		this.codAcceso = codAcceso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getCodPadre() {
		return codPadre;
	}
	public void setCodPadre(Integer codPadre) {
		this.codPadre = codPadre;
	}
	
	
	public boolean isEsPadre() {
		return esPadre;
	}
	public void setEsPadre(boolean esPadre) {
		this.esPadre = esPadre;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public int getEsSubscripcion() {
		return esSubscripcion;
	}
	public void setEsSubscripcion(int esSubscripcion) {
		this.esSubscripcion = esSubscripcion;
	}
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	
	
	

	
	
}
