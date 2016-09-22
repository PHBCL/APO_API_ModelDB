package com.apo.model.dto;

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
@Table(name = "REGLA_VARIABLE")
public class ReglaVariable {

	
	@Id
	@Column(name="COD_REGLA_VAR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqReglaVariable")
	@javax.persistence.SequenceGenerator(name="seqReglaVariable", sequenceName = "SEQ_REGLA_VARIABLE")
	private int codReglaVar;
	
	@OneToOne
	@JoinColumn(name="COD_VARIABLES_PROMOCION")
	@Cascade({CascadeType.PERSIST})
	private VariablesPromocion variablePromocion;
	
	
	@OneToOne
	@JoinColumn(name="COD_REGLAS")
	@Cascade({CascadeType.PERSIST})
	private Regla regla;

	public ReglaVariable(){}
	
	public ReglaVariable(VariablesPromocion variablePromocion,Regla regla){
		this.variablePromocion = variablePromocion;
		this.regla = regla;
	}
	
	
	public int getCodReglaVar() {
		return codReglaVar;
	}

	public void setCodReglaVar(int codReglaVar) {
		this.codReglaVar = codReglaVar;
	}

	public VariablesPromocion getVariablePromocion() {
		return variablePromocion;
	}

	public void setVariablePromocion(VariablesPromocion variablePromocion) {
		this.variablePromocion = variablePromocion;
	}

	public Regla getRegla() {
		return regla;
	}
	
	public void setRegla(Regla regla) {
		this.regla = regla;
	}
	
}
