package com.ms.msacademico.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.msacademico.dao.EmpresDAO;
import com.ms.msacademico.repository.Empresa;

@Service
public class EmpresaBusiness {
	@Autowired
	private EmpresDAO empresaDAO;
	
	public List<Empresa> listadoEmpresas(){
		return empresaDAO.findAll();
	}
	
	public List<Empresa> listaEmpresasPorID(Integer codigoEmpresa){
		return empresaDAO.listaEmpresasPorID(codigoEmpresa);
	}
	
	public List<Empresa> listaEmpresasCustomPorID(Integer codigoEmpresa){
		return empresaDAO.listaEmpresasCustomPorID(codigoEmpresa);
	}
	
	public Empresa guardarActualizarEmpresa(Empresa empresa){
		empresaDAO.save(empresa);
		return empresa;
	}
	
	public List<Empresa> eliminarEmpresa(Empresa empresa){
		empresaDAO.delete(empresa);
		return empresaDAO.findAll();
	}
}
