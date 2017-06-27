package com.ms.msacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.msacademico.business.EmpresaBusiness;
import com.ms.msacademico.repository.Empleado;
import com.ms.msacademico.repository.Empresa;

@RestController
@RequestMapping(value="/empresa")
public class EmpresaController {
	@Autowired
	private EmpresaBusiness empresaBusiness;
	
	@RequestMapping(value="/lista", method=RequestMethod.GET)
	public List<Empresa> listadoEmpresas(){
		return empresaBusiness.listadoEmpresas();
	}
	
	@RequestMapping(value="/listaById/{codigoEmpresa}", method=RequestMethod.GET)
	public List<Empresa> listaEmpresasPorID(@PathVariable("codigoEmpresa") Integer codigoEmpresa){
		return empresaBusiness.listaEmpresasPorID(codigoEmpresa);
	}
	
	@RequestMapping(value="/listaCustomById/{codigoEmpresa}", method=RequestMethod.GET)
	public List<Empresa> listaEmpresasCustomPorID(@PathVariable("codigoEmpresa") Integer codigoEmpresa){
		return empresaBusiness.listaEmpresasCustomPorID(codigoEmpresa);
	}	
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public Empresa guardarEmpresa(@RequestBody Empresa empresa){
		
		for (Empleado empleado : empresa.getListaEmpleados()) {
			empleado.setEmpresaEmpleadoMapping(empresa);
		}
		
		return empresaBusiness.guardarActualizarEmpresa(empresa);
	}
	
	@RequestMapping(value="/actualizar", method=RequestMethod.PUT)
	public Empresa actualizarEmpresa(@RequestBody Empresa empresa){
		for (Empleado empleado : empresa.getListaEmpleados()) {
			empleado.setEmpresaEmpleadoMapping(empresa);
		}
		
		return empresaBusiness.guardarActualizarEmpresa(empresa);
	}	
	
	@RequestMapping(value="/eliminar", method=RequestMethod.DELETE)
	public List<Empresa> eliminarEmpresa(@RequestBody Empresa empresa){
		for (Empleado empleado : empresa.getListaEmpleados()) {
			empleado.setEmpresaEmpleadoMapping(empresa);
		}
		
		return empresaBusiness.eliminarEmpresa(empresa);
	}
}
