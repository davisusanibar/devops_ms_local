package com.ms.msacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.msacademico.business.ProductoBusiness;
import com.ms.msacademico.repository.Producto;

@RestController
@RequestMapping(value="/producto")
public class ProductoController {
	@Autowired
	private ProductoBusiness productoBusiness;
	
	@RequestMapping(value="/lista", method=RequestMethod.GET)
	public List<Producto> listadoProductos(){
		return productoBusiness.listadoProductos();
	}
	
	@RequestMapping(value="/listapreciomayor/{precio}", method=RequestMethod.GET)
	public List<Producto> listadoProductosPreciosMayores(@PathVariable(value="precio") String precio){
		return productoBusiness.listadoProductosPreciosMayores(precio);
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public Producto guardarProducto(@RequestBody Producto producto){		
		return productoBusiness.guardarActualizarProducto(producto);
	}
	
	@RequestMapping(value="/actualizar", method=RequestMethod.PUT)
	public Producto productoBusiness(@RequestBody Producto producto){		
		return productoBusiness.guardarActualizarProducto(producto);
	}	
	
	@RequestMapping(value="/eliminar", method=RequestMethod.DELETE)
	public List<Producto> eliminarProducto(@RequestBody Producto producto){		
		return productoBusiness.eliminarProducto(producto);
	}	
}
