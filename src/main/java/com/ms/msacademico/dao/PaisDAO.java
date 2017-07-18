package com.ms.msacademico.dao;

import com.ms.msacademico.repository.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaisDAO extends JpaRepository<Pais, Integer> {
	@Query("select d.nombre, d.temperaturaMaxima from Pais p, "
			+ "Departamento d "
			+ "where p.codigoPais = d.departamentoPais")
	public List<Pais> listaPaisYDistritos();
	

}
