package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "VARIABLES_PROMOCION")
public class VariablesPromocion {

	
	@Id
	@Column(name="COD_VARIABLES_PROMOCION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqVariablesPromocion")
	@javax.persistence.SequenceGenerator(name="seqVariablesPromocion", sequenceName = "SEQ_VARIABLES_PROMOCION", allocationSize = 1)
	private int codVariablePromocion;
	
	@Column(name="NOMBRE_VARIABLE_MOTOR")
	private String nombreVariableMotor;
	
	@Column(name="NOMBRE_VARIABLE_USUARIO")
	private String nombreVariableUsuario;
	
	@Column(name="NOMBRE_VARIABLE_CARTELERIA")
	private String nombreVariableCarteleria;
	

	
	public VariablesPromocion(){}
	
	public VariablesPromocion(String nombreVarMotor,String nombreVarUsuario,String nombreVarCarteleria){
		this.nombreVariableMotor = nombreVarMotor;
		this.nombreVariableUsuario = nombreVarUsuario;
		this.nombreVariableCarteleria = nombreVarCarteleria;
	}
	
	
	
	public int getCodVariablePromocion() {
		return codVariablePromocion;
	}

	public void setCodVariablePromocion(int codVariablePromocion) {
		this.codVariablePromocion = codVariablePromocion;
	}

	public String getNombreVariableMotor() {
		return nombreVariableMotor;
	}

	public void setNombreVariableMotor(String nombreVariableMotor) {
		this.nombreVariableMotor = nombreVariableMotor;
	}

	public String getNombreVariableUsuario() {
		return nombreVariableUsuario;
	}

	public void setNombreVariableUsuario(String nombreVariableUsuario) {
		this.nombreVariableUsuario = nombreVariableUsuario;
	}

	public String getNombreVariableCarteleria() {
		return nombreVariableCarteleria;
	}

	public void setNombreVariableCarteleria(String nombreVariableCarteleria) {
		this.nombreVariableCarteleria = nombreVariableCarteleria;
	}

	
	
	
	
	
}
