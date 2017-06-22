package com.ms.msacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.msacademico.repository.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer> {

}
