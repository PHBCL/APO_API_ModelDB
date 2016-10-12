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
@Table(name = "REGLA_PROM_PLANTILLA")
public class ReglaPromocionPlantilla {

	
	@Id
	@Column(name="COD_REGLA_PROMPLANT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqReglaPromPlantilla")
	@javax.persistence.SequenceGenerator(name="seqReglaPromPlantilla", sequenceName = "SEQ_REGLA_PROM_PLANTILLA", allocationSize = 1)
	private int codReglaPromocionPlantilla;
	
	@OneToOne
	@JoinColumn(name="REG_PROM_COD_REGLA")
	@Cascade({CascadeType.PERSIST})
	private ReglaPromocion reglaPromocion;
	
	
	@OneToOne
	@JoinColumn(name="PLANTILLA_COD_PLANTILLA")
	@Cascade({CascadeType.PERSIST})
	private Plantilla plantilla;


	
	public ReglaPromocionPlantilla(){}
	
	public ReglaPromocionPlantilla(ReglaPromocion reglaPromocion,Plantilla plantilla){
		this.reglaPromocion = reglaPromocion;
		this.plantilla = plantilla;
	}
	
	
	public int getCodReglaPromocionPlantilla() {
		return codReglaPromocionPlantilla;
	}


	public void setCodReglaPromocionPlantilla(int codReglaPromocionPlantilla) {
		this.codReglaPromocionPlantilla = codReglaPromocionPlantilla;
	}


	public ReglaPromocion getReglaPromocion() {
		return reglaPromocion;
	}


	public void setReglaPromocion(ReglaPromocion reglaPromocion) {
		this.reglaPromocion = reglaPromocion;
	}


	public Plantilla getPlantilla() {
		return plantilla;
	}


	public void setPlantilla(Plantilla plantilla) {
		this.plantilla = plantilla;
	}
	
	
	
}
