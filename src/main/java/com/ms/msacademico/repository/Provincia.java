package com.ms.msacademico.repository;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Provincia {
	@Id
	@GeneratedValue
	private int codigoProvincia;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="departamento_provincia_fk")
	@JsonBackReference	
	Departamento departamentoProvincia;
	
	@OneToMany(mappedBy="distritoProvincia", cascade=CascadeType.ALL)
	@JsonManagedReference
	List<Distrito> listaDistritos;

	public Provincia() {
		super();
	}

	public Provincia(int codigoProvincia, String nombre, Departamento departamentoProvincia,
			List<Distrito> listaDistritos) {
		super();
		this.codigoProvincia = codigoProvincia;
		this.nombre = nombre;
		this.departamentoProvincia = departamentoProvincia;
		this.listaDistritos = listaDistritos;
	}

	public int getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(int codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamentoProvincia() {
		return departamentoProvincia;
	}

	public void setDepartamentoProvincia(Departamento departamentoProvincia) {
		this.departamentoProvincia = departamentoProvincia;
	}

	public List<Distrito> getListaDistritos() {
		return listaDistritos;
	}

	public void setListaDistritos(List<Distrito> listaDistritos) {
		this.listaDistritos = listaDistritos;
	}
}
