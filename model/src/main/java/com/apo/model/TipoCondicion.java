package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TIPO_CONDICION")
public class TipoCondicion {
	
	@Id
	@Column(name="COD_TIPO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTipoCondicion")
	@javax.persistence.SequenceGenerator(name="seqTipoCondicion", sequenceName = "SEQ_TIPO_CONDICION")
	private int codTipo;
	
	@Column(name="TIPO_CONDICION")
	private String tipoCondicion;

	public TipoCondicion(){}
	
	public TipoCondicion(String tipoCondicion){
		this.tipoCondicion = tipoCondicion;
	}

	public int getCodTipo() {
		return codTipo;
	}

	public void setCodTipo(int codTipo) {
		this.codTipo = codTipo;
	}

	public String getTipoCondicion() {
		return tipoCondicion;
	}

	public void setTipoCondicion(String tipoCondicion) {
		this.tipoCondicion = tipoCondicion;
	}

	

}
