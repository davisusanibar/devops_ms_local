package com.ms.msacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.msacademico.repository.Alumno;

public interface AlumnoDao extends JpaRepository<Alumno, Integer> {

}