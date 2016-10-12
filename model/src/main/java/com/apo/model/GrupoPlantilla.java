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
@Table(name = "GRUPO_PLANTILLA")
public class GrupoPlantilla {
	
	   @Id
	   @Column(name="COD_GRUPO")
	   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGrupoPlantilla")
	   @javax.persistence.SequenceGenerator(name="seqGrupoPlantilla", sequenceName = "SEQ_GRUPO_PLANTILLA", allocationSize = 1)
	   private int codGrupo;
	   
	   @Column(name="NOMBRE")
	   private String nombre;
	   
	   @Column(name="RUTA_ARCH")
	   private String rutaArch;
	   
	   @OneToOne
	   @JoinColumn(name="COD_PLANTILLA")
	   @Cascade({CascadeType.PERSIST})
	   private Plantilla plantilla;
	   
	   @OneToOne
	   @JoinColumn(name="USUARIO_CREADOR")
	   @Cascade({CascadeType.PERSIST})
	   private Usuario usuario;
	   
	   
	   public GrupoPlantilla(){}
	  
	   public GrupoPlantilla(int codGrupo){
		   this.codGrupo = codGrupo;
	   }
	   
	   public GrupoPlantilla(int codGrupo,String nombre, String rutaArch, Plantilla plantilla, Usuario usuario){
		   this.codGrupo = codGrupo;
		   this.nombre= nombre;
		   this.rutaArch = rutaArch;
		   this.plantilla = plantilla;
		   this.usuario = usuario;
	   }
	   
	   
	   public GrupoPlantilla(String nombre, String rutaArch, Plantilla plantilla, Usuario usuario){
		   this.nombre= nombre;
		   this.rutaArch = rutaArch;
		   this.plantilla = plantilla;
		   this.usuario = usuario;
	   }

	public int getCodGrupo() {
		return codGrupo;
	}

	public void setCodGrupo(int codGrupo) {
		this.codGrupo = codGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRutaArch() {
		return rutaArch;
	}

	public void setRutaArch(String rutaArch) {
		this.rutaArch = rutaArch;
	}

	public Plantilla getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(Plantilla plantilla) {
		this.plantilla = plantilla;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	   
	   
	   

}
