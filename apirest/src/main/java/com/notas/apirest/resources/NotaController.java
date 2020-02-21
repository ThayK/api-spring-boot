package com.notas.apirest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notas.apirest.model.Nota;
import com.notas.apirest.repository.NotasRepository;
import com.notas.apirest.service.AtualizarNota;
import com.notas.apirest.service.InserirNota;

@RestController
@RequestMapping(value="/api/notas")
public class NotaController {
	
	@Autowired
	NotasRepository notasRepository;
	
	@Autowired
	InserirNota inserirNota;
	
	@Autowired
	AtualizarNota atualizarNota;
	
	@RequestMapping(value="/buscar")
	public List<Nota> buscarTodasNotas(){
		return notasRepository.findAll();
	}
	
	@RequestMapping(value="/buscar/{matricula}")
	public Nota buscarUmRegistro(@PathVariable(value= "matricula") Integer matricula) {
		return notasRepository.findById(matricula);
	}
	
	@RequestMapping(value="/inserir")
	public void inserirRegistro(@RequestBody ArrayList<Nota> nota) {
		inserirNota.inserirNota(nota);
	}
	
	@RequestMapping(value="/atualizar")
	public void atualizarRegistro(@RequestBody Nota nota) {
		atualizarNota.atualizar(nota);
	}
	
	@RequestMapping(value="/delete")
	public void deletarRegistro(@RequestBody Nota nota) {
		notasRepository.delete(nota);
	}
	
}
