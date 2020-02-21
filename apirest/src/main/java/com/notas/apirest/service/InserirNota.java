package com.notas.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notas.apirest.model.Nota;
import com.notas.apirest.repository.NotasRepository;

@Service
public class InserirNota {

	@Autowired
	NotasRepository notasRepository;
	
	//Insere-se todas as notas, esperando algo como um front que recebe um .xls ou .csv e chega para o back end como json
	public void inserirNota(List<Nota> nota) {
		
		//Considere média 5z
		//Se ficou em uma disciplina, já está em dependencia
		
		for(int i=0; i<nota.size();i++) {
		 Nota notaDeCadaRegistro = new Nota();
		 
		 notaDeCadaRegistro.setBimestre(nota.get(i).getBimestre());
		 notaDeCadaRegistro.setDescricaoDisciplina(nota.get(i).getDescricaoDisciplina());
		 notaDeCadaRegistro.setMatricula(nota.get(i).getMatricula());
		 notaDeCadaRegistro.setNotaCiencias(nota.get(i).getNotaCiencias());
		 notaDeCadaRegistro.setNotaHistoria(nota.get(i).getNotaHistoria());
		 notaDeCadaRegistro.setNotaMatematica(nota.get(i).getNotaMatematica());
		 notaDeCadaRegistro.setNotaPortugues(nota.get(i).getNotaPortugues());
		 
		if(notaDeCadaRegistro.getNotaCiencias() <5 || notaDeCadaRegistro.getNotaHistoria() <5 || notaDeCadaRegistro.getNotaMatematica() <5 || notaDeCadaRegistro.getNotaPortugues() <5) {
			notaDeCadaRegistro.setRecuperacao(true);
		}else {
			notaDeCadaRegistro.setRecuperacao(false);
		}
		
		notasRepository.save(notaDeCadaRegistro);
	  }
	}
}
