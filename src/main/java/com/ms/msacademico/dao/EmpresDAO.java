package com.ms.msacademico.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ms.msacademico.repository.Empresa;

public interface EmpresDAO extends JpaRepository<Empresa, Integer> {
	@Query("select ie from idat_empresa ie where codigoEmpresa = :codigoEmpresa")
	public List<Empresa> listaEmpresasPorID(@Param("codigoEmpresa") Integer codigoEmpresa);
	
	@Query("select nombre from idat_empresa where codigoEmpresa = :codigoEmpresa")
	public List<Empresa> listaEmpresasCustomPorID(@Param("codigoEmpresa") Integer codigoEmpresa);
}
