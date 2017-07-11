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

@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private int codigoDepartamento;
	private String nombre;
	private String temperaturaMaxima;
	private String temperaturaMinima;
	
	@ManyToOne
	@JoinColumn(name="departamento_pais_fk")
	@JsonBackReference	
	Pais departamentoPais;
	
	@OneToMany(mappedBy="departamentoProvincia", cascade=CascadeType.ALL)
	List<Provincia> listaProvincias;

	public Departamento() {
		super();
	}

	public Departamento(int codigoDepartamento, String nombre, String temperaturaMaxima, String temperaturaMinima,
			Pais departamentoPais, List<Provincia> listaProvincias) {
		super();
		this.codigoDepartamento = codigoDepartamento;
		this.nombre = nombre;
		this.temperaturaMaxima = temperaturaMaxima;
		this.temperaturaMinima = temperaturaMinima;
		this.departamentoPais = departamentoPais;
		this.listaProvincias = listaProvincias;
	}

	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(String temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public String getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(String temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public Pais getDepartamentoPais() {
		return departamentoPais;
	}

	public void setDepartamentoPais(Pais departamentoPais) {
		this.departamentoPais = departamentoPais;
	}

	public List<Provincia> getListaProvincias() {
		return listaProvincias;
	}

	public void setListaProvincias(List<Provincia> listaProvincias) {
		this.listaProvincias = listaProvincias;
	}	
}
