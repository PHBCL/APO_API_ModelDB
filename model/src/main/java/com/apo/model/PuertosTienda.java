package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PUERTOS_TIENDA")
public class PuertosTienda {
	
	@Id
	@Column(name="COD_PUERTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPuerto")
	@javax.persistence.SequenceGenerator(name="seqPuerto", sequenceName = "SEQ_PUERTO", allocationSize = 1)
	private int codPuerto;
	
	@Column(name="ESTADO")
	private String estado;
	
	@OneToOne
	@JoinColumn(name="COD_USUARIO")
	private Usuario usuario;
	
	public PuertosTienda(){}
	public PuertosTienda(String estado, Usuario usuario){
		this.estado = estado;
		this.usuario = usuario;
	}
	public int getCodPuerto() {
		return codPuerto;
	}
	public void setCodPuerto(int codPuerto) {
		this.codPuerto = codPuerto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
