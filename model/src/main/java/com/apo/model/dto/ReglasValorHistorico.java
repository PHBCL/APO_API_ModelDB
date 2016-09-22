package com.apo.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "REGLAS_VALOR_HISTORICO")
public class ReglasValorHistorico {


	@Id
	@Column(name="COD_REGLA_PROMOCION")
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

	public ReglasValorHistorico(){}
	public ReglasValorHistorico(Promocion promocion, ConfiguracionPlantilla confPlantilla,String condicion, String valor){
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
	public void setConfiguracionPlantilla(ConfiguracionPlantilla configuracionPlantilla) {
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
