package com.notas.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notas.apirest.model.Nota;
import com.notas.apirest.repository.NotasRepository;

@Service
public class AtualizarNota {

	@Autowired
	NotasRepository notasRepository;
	
	public void atualizar(Nota nota) {
		
		if(nota.getNotaCiencias() <5 || nota.getNotaHistoria() <5 || nota.getNotaMatematica() <5 || nota.getNotaPortugues() <5) {
			nota.setRecuperacao(true);
		}else {
			nota.setRecuperacao(false);
		}
		
		notasRepository.save(nota);
		
	}
}
