package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "CONFIGURACION_PLANTILLA")
public class ConfiguracionPlantilla {

	@Id
	@Column(name="COD_CONFIGURACION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "confPlantillaSeq")
	@javax.persistence.SequenceGenerator(name="confPlantillaSeq", sequenceName = "SEQ_CONFIGURACION_PLANTILLA", allocationSize = 1)
	private int codConfiguracion;
	
	@OneToOne
	@JoinColumn(name="COD_PLANTILLA")
	@Cascade({CascadeType.PERSIST})
	private Plantilla plantilla;
	
	@OneToOne
	@JoinColumn(name="COD_REGLA_VAR")
	@Cascade({CascadeType.PERSIST})
	private ReglaVariable reglaVariable;
	
	@OneToOne
	@JoinColumn(name="COD_TIPO")
	@Cascade({CascadeType.PERSIST})
	private TipoCondicion tipoCondicion;

	public ConfiguracionPlantilla(){}
	
	public ConfiguracionPlantilla(Plantilla plantilla,ReglaVariable regla,TipoCondicion condicion){
		this.plantilla = plantilla;
		this.reglaVariable = regla;
		this.tipoCondicion = condicion;
	}
	
	
	
	
	public int getCodConfiguracion() {
		return codConfiguracion;
	}

	public void setCodConfiguracion(int codConfiguracion) {
		this.codConfiguracion = codConfiguracion;
	}

	public Plantilla getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(Plantilla plantilla) {
		this.plantilla = plantilla;
	}

	public ReglaVariable getReglaVariable() {
		return reglaVariable;
	}

	public void setReglaVariable(ReglaVariable reglaVariable) {
		this.reglaVariable = reglaVariable;
	}

	public TipoCondicion getTipoCondicion() {
		return tipoCondicion;
	}

	public void setTipoCondicion(TipoCondicion tipoCondicion) {
		this.tipoCondicion = tipoCondicion;
	}
	

	
	
}
