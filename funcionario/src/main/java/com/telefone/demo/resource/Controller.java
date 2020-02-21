package com.telefone.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telefone.demo.model.DadosFuncionario;
import com.telefone.demo.repository.DadosFuncionarioRepository;

@RestController
@RequestMapping(value="/api/funcionario")
public class Controller {

	@Autowired
	DadosFuncionarioRepository dadosFuncionarioRepository;
	
	@RequestMapping(value="/buscar")
	public List<DadosFuncionario> buscarFuncionarios(){
		return dadosFuncionarioRepository.findAll();
	}
	
	@RequestMapping(value="/inserir")
	public void inserirRegistro(@RequestBody DadosFuncionario dadosFuncionario) {
		dadosFuncionarioRepository.save(dadosFuncionario);
	}
	
	@RequestMapping(value="/editar")
	public void editarRegistro(@RequestBody DadosFuncionario dadosFuncionario) {
		dadosFuncionarioRepository.save(dadosFuncionario);
	}
	
	@RequestMapping(value="/deletar")
	public void deletarRegistro(@RequestBody DadosFuncionario dadosFuncionario) {
		dadosFuncionarioRepository.delete(dadosFuncionario);
	}
}
