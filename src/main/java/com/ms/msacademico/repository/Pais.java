package com.ms.msacademico.repository;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pais {
	@Id
	@GeneratedValue
	private int codigoPais;
	private String nombre;
	private String capital;
	
	@OneToMany(mappedBy="departamentoPais", cascade=CascadeType.ALL)
	private List<Departamento> listaDepartamentos;

	public Pais(int codigoPais, String nombre, String capital, List<Departamento> listaDepartamentos) {
		super();
		this.codigoPais = codigoPais;
		this.nombre = nombre;
		this.capital = capital;
		this.listaDepartamentos = listaDepartamentos;
	}

	public Pais() {
		super();
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
}
