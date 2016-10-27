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
@Table(name = "REGLAS_VALOR")
public class ReglaValor {

	
	@Id
	@Column(name="COD_REGLA_PROMOCION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqReglaValor")
	@javax.persistence.SequenceGenerator(name="seqReglaValor", sequenceName = "SEQ_REGLAS_VALOR")
	private int codReglaPromocion;
	
	@OneToOne
	@JoinColumn(name="COD_PROMOCION")
	private Promocion promocion;
	
	@OneToOne
	@JoinColumn(name="COD_CONFIGURACION")
	private ConfiguracionPlantilla configuracionPlantilla;
	

	@Column(name="CONDICION")
	private String condicion;
	

	@Column(name="VALOR")
	private String valor;

	public ReglaValor(){}
	public ReglaValor(Promocion promocion, ConfiguracionPlantilla confPlantilla,String condicion, String valor){
		this.promocion = promocion;
		this.configuracionPlantilla = confPlantilla;
		this.condicion = condicion;
		this.valor = valor;
	}
	
	
	public int getCodReglaPromocion() {
		return codReglaPromocion;
	}


	public void setCodReglaPromocion(int codReglaPromocion) {
		this.codReglaPromocion = codReglaPromocion;
	}


	public Promocion getPromocion() {
		return promocion;
	}


	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}


	public ConfiguracionPlantilla getConfiguracionPlantilla() {
		return configuracionPlantilla;
	}


	public void setConfiguracionPlantilla(
			ConfiguracionPlantilla configuracionPlantilla) {
		this.configuracionPlantilla = configuracionPlantilla;
	}


	public String getCondicion() {
		return condicion;
	}


	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
}
