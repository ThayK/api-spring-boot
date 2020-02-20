package com.telefone.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telefone.demo.models.ControleTelefone;

public interface TelefoneRepository extends JpaRepository<ControleTelefone, Long>{

	ControleTelefone findById(Integer id);
}
