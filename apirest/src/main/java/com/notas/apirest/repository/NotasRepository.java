package com.notas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notas.apirest.model.Nota;

public interface NotasRepository extends JpaRepository<Nota,Long> {

	Nota findById(Integer matricula);
}
