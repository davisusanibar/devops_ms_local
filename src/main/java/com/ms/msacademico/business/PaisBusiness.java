package com.ms.msacademico.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.msacademico.dao.PaisDAO;
import com.ms.msacademico.repository.Pais;

@Service
public class PaisBusiness {
	@Autowired
	private PaisDAO paisDAO;
	
	public List<Pais> listadoPais(){
		return paisDAO.findAll();
	}
	
	public List<Pais> listaPaisYDistritos(){
		return paisDAO.listaPaisYDistritos();
	}
	
	public Pais guardarActualizarPais(Pais pais){
		paisDAO.save(pais);
		return pais;
	}
	
	public List<Pais> eliminarPais(Pais pais){
		paisDAO.delete(pais);
		return paisDAO.findAll();
	}
}
