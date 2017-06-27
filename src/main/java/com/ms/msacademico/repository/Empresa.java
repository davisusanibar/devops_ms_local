package com.ms.msacademico.repository;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="idat_empresa")
public class Empresa {
	@Id
	@GeneratedValue
	private int codigoEmpresa;
	private int ruc;
	private String nombre;
	
	@OneToMany(mappedBy="empresaEmpleadoMapping", cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<Empleado> listaEmpleados;

	public Empresa() {
		super();
	}

	public Empresa(int codigoEmpresa, int ruc, String nombre, List<Empleado> listaEmpleados) {
		super();
		this.codigoEmpresa = codigoEmpresa;
		this.ruc = ruc;
		this.nombre = nombre;
		this.listaEmpleados = listaEmpleados;
	}

	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}	
}