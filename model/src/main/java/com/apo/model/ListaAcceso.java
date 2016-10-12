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
@Table(name = "LISTA_ACCESO")
public class ListaAcceso {

	@Id
	@Column(name="COD_LISTAACCESO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqListaAcceso")
	@javax.persistence.SequenceGenerator(name="seqListaAcceso", sequenceName = "SEQ_LISTA_ACCESO", allocationSize = 1)
	private int codListaAcceso;
	
	
	@ManyToOne
	@JoinColumn(name="COD_ROL")
	@Cascade({CascadeType.PERSIST})
	private Rol rol;
	
	@ManyToOne
	@JoinColumn(name="COD_ACCESO")
	@Cascade({CascadeType.PERSIST})
	private Acceso acceso;

	
	public ListaAcceso(){}
	
	public ListaAcceso(Rol rol,Acceso acceso){
		this.rol = rol;
		this.acceso = acceso;
	}
	
	
	public int getCodListaAcceso() {
		return codListaAcceso;
	}

	public void setCodListaAcceso(int codListaAcceso) {
		this.codListaAcceso = codListaAcceso;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Acceso getAcceso() {
		return acceso;
	}

	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}
	
	
}
