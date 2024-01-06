package com.generation.CRUDFarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.CRUDFarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}