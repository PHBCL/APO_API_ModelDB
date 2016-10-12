package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PRORRATEO")
public class Prorrateo {

	@Id
	@Column(name="COD_PRORRATEO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProrrateo")
	@javax.persistence.SequenceGenerator(name="seqProrrateo", sequenceName = "SEQ_PRORRATEO", allocationSize = 1)
	private int codProrrateo;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="AB_MOTOR")
	private String abMotor;
	
	public Prorrateo(){}
	
	public Prorrateo(String nombre, String abMotor){
		this.nombre = nombre;
		this.abMotor = abMotor;
	}

	public int getCodProrrateo() {
		return codProrrateo;
	}

	public void setCodProrrateo(int codProrrateo) {
		this.codProrrateo = codProrrateo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbMotor() {
		return abMotor;
	}

	public void setAbMotor(String abMotor) {
		this.abMotor = abMotor;
	}
	
	
	
	
}
