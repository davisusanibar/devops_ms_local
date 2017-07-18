package com.ms.msacademico.controller;

import com.ms.msacademico.business.PaisBusiness;
import com.ms.msacademico.repository.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/pais")
public class PaisController {
	@Autowired
	private PaisBusiness paisBusiness;
	
	@RequestMapping(value="/listar", method= RequestMethod.GET)
	public List<Pais> listadoPais(){
		return paisBusiness.listadoPais();
	}
	@RequestMapping(value="/listaPaisYDistritos", method= RequestMethod.GET)
	public List<Pais> listaPaisYDistritos(){
		return paisBusiness.listaPaisYDistritos();
	}
	
	@RequestMapping(value="/guardar", method= RequestMethod.POST)
	public Pais guardarProducto(@RequestBody Pais pais){
		return paisBusiness.guardarActualizarPais(pais);
	}
	
	@RequestMapping(value="/actualizar", method= RequestMethod.PUT)
	public Pais productoBusiness(@RequestBody Pais pais){
		return paisBusiness.guardarActualizarPais(pais);
	}	
	
	@RequestMapping(value="/eliminar", method= RequestMethod.DELETE)
	public List<Pais> eliminarProducto(@RequestBody Pais pais){
		return paisBusiness.eliminarPais(pais);
	}
}
