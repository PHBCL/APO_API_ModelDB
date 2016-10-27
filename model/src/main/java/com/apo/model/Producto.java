package com.apo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
	
	@Id
	@Column(name="COD_PRODUCTO")
	private int codProducto;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="MODELO")
	private String modelo;
	
	@Column(name="PRECIO_NORMAL")
	private String precioNormal;
	
	@Column(name="PRECIO_OFERTA")
	private String precioOferta;
	
	@Column(name="PRECIO_TARJETA")
	private String precioTarjeta;
	
	@OneToOne
	@JoinColumn(name="COD_MARCA")
	private Marca marca;
	
	@OneToOne
	@JoinColumn(name="COD_USUARIO")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name="COD_JERARQUIA")
	private Jerarquia jerarquia;
	
	
	public Producto(){}
	public Producto(String nombre, 
					String descripcion,
					String modelo, 
					String precioNormal, 
					String precioOferta, 
					String precioTarjeta,
					Marca marca,
					Usuario usuario,
					Jerarquia jerarquia){
		
		this.nombre= nombre;
		this.descripcion = descripcion;
		this.modelo = modelo;
		this.precioNormal = precioNormal;
		this.precioOferta = precioOferta;
		this.precioTarjeta = precioTarjeta;
		this.marca = marca;
		this.usuario = usuario;
		this.jerarquia = jerarquia;
	}
	
	public Producto(int codProducto,
					String nombre, 
					String descripcion,
					String modelo, 
					String precioNormal, 
					String precioOferta, 
					String precioTarjeta,
					Marca marca,
					Usuario usuario,
					Jerarquia jerarquia){
		
		this.codProducto = codProducto;
		this.nombre= nombre;
		this.descripcion = descripcion;
		this.modelo = modelo;
		this.precioNormal = precioNormal;
		this.precioOferta = precioOferta;
		this.precioTarjeta = precioTarjeta;
		this.marca = marca;
		this.usuario = usuario;
		this.jerarquia = jerarquia;
	}
	
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPrecioNormal() {
		return precioNormal;
	}
	public void setPrecioNormal(String precioNormal) {
		this.precioNormal = precioNormal;
	}
	public String getPrecioOferta() {
		return precioOferta;
	}
	public void setPrecioOferta(String precioOferta) {
		this.precioOferta = precioOferta;
	}
	public String getPrecioTarjeta() {
		return precioTarjeta;
	}
	public void setPrecioTarjeta(String precioTarjeta) {
		this.precioTarjeta = precioTarjeta;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Jerarquia getJerarquia() {
		return jerarquia;
	}
	public void setJerarquia(Jerarquia jerarquia) {
		this.jerarquia = jerarquia;
	}
}
