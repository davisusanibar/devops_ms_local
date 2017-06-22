package com.ms.msacademico.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.msacademico.dao.AlumnoDao;
import com.ms.msacademico.repository.Alumno;

@Service
public class AlumnoBusiness {
	
	@Autowired
	private AlumnoDao alumnoDao;
	
	public List<Alumno> listadoAlumnos(){
		return alumnoDao.findAll();
	}
	
	public Alumno guardarActualizarAlumno(Alumno alumno){
		alumnoDao.save(alumno);
		return alumno;
	}
	
	public List<Alumno> eliminarAlumno(Alumno alumno){
		alumnoDao.delete(alumno);
		return alumnoDao.findAll();
	}
}
