package com.ms.msacademico.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.msacademico.dao.ProductoDao;
import com.ms.msacademico.repository.Producto;

@Service
public class ProductoBusiness {
	@Autowired
	private ProductoDao productoDao;
	
	public List<Producto> listadoProductos(){
		return productoDao.findAll();
	}
	
	public List<Producto> listadoProductosPreciosMayores(String precio){
		
		List<Producto> listaProducto = new ArrayList<Producto>();
		
		for (Producto producto : productoDao.findAll()) {
			if(producto.getPrecio() > Double.parseDouble(precio)){
				listaProducto.add(producto);
			}
		}
		
		return listaProducto;
	}
	
	public Producto guardarActualizarProducto(Producto producto){
		productoDao.save(producto);
		return producto;
	}
	
	public List<Producto> eliminarProducto(Producto producto){
		productoDao.delete(producto);
		return productoDao.findAll();
	}
}
