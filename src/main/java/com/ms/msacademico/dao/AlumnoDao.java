package com.ms.msacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ms.msacademico.repository.Alumno;

public interface AlumnoDao extends JpaRepository<Alumno, Integer> {

}