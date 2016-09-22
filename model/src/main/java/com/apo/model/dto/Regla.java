package com.apo.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "REGLAS")
public class Regla {

	
	@Id
	@Column(name="COD_REGLAS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqReglas")
	@javax.persistence.SequenceGenerator(name="seqReglas", sequenceName = "SEQ_REGLAS", allocationSize = 1)
	private int codRegla;
	
	@Column(name="NOMBRE_REGLA_MOTOR")
	private String nombreReglaMotor;
	
	@Column(name="NOMBRE_REGLA_USUARIO")
	private String nombreReglaUsuario;

	
	
	
	
	public Regla(){}
	
	public Regla(String nombreReglaMotor,String nombreReglaUsuario){
		this.nombreReglaMotor = nombreReglaMotor;
		this.nombreReglaUsuario = nombreReglaUsuario;
	}
	
	
	public int getCodRegla() {
		return codRegla;
	}

	public void setCodRegla(int codRegla) {
		this.codRegla = codRegla;
	}

	public String getNombreReglaMotor() {
		return nombreReglaMotor;
	}

	public void setNombreReglaMotor(String nombreReglaMotor) {
		this.nombreReglaMotor = nombreReglaMotor;
	}

	public String getNombreReglaUsuario() {
		return nombreReglaUsuario;
	}

	public void setNombreReglaUsuario(String nombreReglaUsuario) {
		this.nombreReglaUsuario = nombreReglaUsuario;
	}

	
	
	
}
