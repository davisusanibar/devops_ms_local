package com.ms.msacademico.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="idat_empleado")
public class Empleado {
	@Id
	@GeneratedValue
	private int codigoEmpleado;
	private int dni;
	private String nombre;
	private String apellido;
	
	@ManyToOne
	@JoinColumn(name="codigoEmpresaEmpleado")
	@JsonBackReference
	private Empresa empresaEmpleadoMapping;

	public Empleado() {
		super();
	}

	public Empleado(int codigoEmpleado, int dni, String nombre, String apellido, Empresa empresaEmpleadoMapping) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresaEmpleadoMapping = empresaEmpleadoMapping;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
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

	public Empresa getEmpresaEmpleadoMapping() {
		return empresaEmpleadoMapping;
	}

	public void setEmpresaEmpleadoMapping(Empresa empresaEmpleadoMapping) {
		this.empresaEmpleadoMapping = empresaEmpleadoMapping;
	}		
}