package com.telefone.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telefone.demo.model.DadosFuncionario;

public interface DadosFuncionarioRepository extends JpaRepository<DadosFuncionario, Long>{
	
	
}
