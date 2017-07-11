package com.ms.msacademico.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Distrito {
	@Id
	@GeneratedValue
	private int codigoDistrito;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="distrito_provincia_fk")
	@JsonBackReference
	private Provincia distritoProvincia;
	
	public Distrito() {
		super();
	}

	public Distrito(int codigoDistrito, String nombre, Provincia distritoProvincia) {
		super();
		this.codigoDistrito = codigoDistrito;
		this.nombre = nombre;
		this.distritoProvincia = distritoProvincia;
	}

	public int getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistrito(int codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getDistritoProvincia() {
		return distritoProvincia;
	}

	public void setDistritoProvincia(Provincia distritoProvincia) {
		this.distritoProvincia = distritoProvincia;
	}		
}