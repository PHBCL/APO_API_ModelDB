package com.apo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@Column(name="COD_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
	@javax.persistence.SequenceGenerator(name="userSeq", sequenceName = "SEQ_USUARIO", allocationSize = 1)
	private int codUsuario;
	
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="APELLIDO")
	private String apellido;
	@Column(name="USUARIO")
	private String usuario;
	@Column(name="CONTRASENA")
	private String contrasena;
	
	@Column(name="FECHACREACION", columnDefinition="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "MMM dd, yyyy HH:mm:ss a")
	private Date fechaCreacion;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TOKEN")
	private String token;
	
	@Column(name="CODPASSRECOV")
	private String codPassRecov;
	
	@Column(name="CAR_FOLDER")
	private String carFolder;
	

	@Column(name="CAR_MOTOR")
	private String carMotor;
	
	@ManyToOne
	@JoinColumn(name="COD_ROL")
	@Cascade({CascadeType.PERSIST})
	private Rol rol;

	//0=no.1=si
	@Column(name="esSUBSCRIPTOR")
	private int esSubscriptor;
	
	
	
	public Usuario(){}
	
	public Usuario(String nombre,String apellido,String usuario,String contrasena,String email,String token, Rol rol, int esSubscriptor){
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.fechaCreacion = new Date();
		this.email = email;
		this.token = token;
		this.rol = rol;
		this.esSubscriptor = esSubscriptor; 
	}
	
	
	
	
	
	public String getCarFolder() {
		return carFolder;
	}

	public void setCarFolder(String carFolder) {
		this.carFolder = carFolder;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getCodPassRecov() {
		return codPassRecov;
	}

	public void setCodPassRecov(String codPassRecov) {
		this.codPassRecov = codPassRecov;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombreCompleto(){
		return this.nombre + " " + this.apellido;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getEsSubscriptor() {
		return esSubscriptor;
	}

	public void setEsSubscriptor(int esSubscriptor) {
		this.esSubscriptor = esSubscriptor;
	}

	public String getCarMotor() {
		return carMotor;
	}

	public void setCarMotor(String carMotor) {
		this.carMotor = carMotor;
	}
	
}
