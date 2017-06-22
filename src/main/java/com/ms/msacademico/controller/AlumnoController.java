package com.ms.msacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.msacademico.business.AlumnoBusiness;
import com.ms.msacademico.repository.Alumno;

@RestController
@RequestMapping(value="/alumno")
public class AlumnoController {
	@Autowired
	private AlumnoBusiness alumnoBusiness;
	
	@RequestMapping(value="/lista", method=RequestMethod.GET)
	public List<Alumno> listadoAlumnos(){
		return alumnoBusiness.listadoAlumnos();
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public Alumno guardarAlumno(@RequestBody Alumno alumno){		
		return alumnoBusiness.guardarActualizarAlumno(alumno);
	}
	
	@RequestMapping(value="/actualizar", method=RequestMethod.PUT)
	public Alumno actualizarAlumno(@RequestBody Alumno alumno){		
		return alumnoBusiness.guardarActualizarAlumno(alumno);
	}	
	
	@RequestMapping(value="/eliminar", method=RequestMethod.DELETE)
	public List<Alumno> eliminarAlumno(@RequestBody Alumno alumno){		
		return alumnoBusiness.eliminarAlumno(alumno);
	}	
}
