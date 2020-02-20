package com.telefone.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telefone.demo.models.ControleTelefone;
import com.telefone.demo.repository.TelefoneRepository;

@RestController
@RequestMapping(value="/api/telefones")
public class Controller {
	
	@Autowired
	TelefoneRepository telefoneRepository;
	
	
	@GetMapping("/telefones")
	public List<ControleTelefone> listarTelefones(){
		return telefoneRepository.findAll();
	}
	
	@GetMapping("/telefone/{id}")	
	public ControleTelefone listarTelefone(@PathVariable(value="id") Integer id){
		return telefoneRepository.findById(id);
	}
	
	@PostMapping("/telefone")
	public ControleTelefone salvarTelefone(@RequestBody ControleTelefone controleTelefone) {
		return telefoneRepository.save(controleTelefone);
	}
	
	@DeleteMapping("/telefone/delete")
	public void deletaTelefone(@RequestBody ControleTelefone controleTelefone) {
		telefoneRepository.delete(controleTelefone);
	}
	
	@PutMapping("/telefone/atualizar")
	public ControleTelefone atualizarTelefone(@RequestBody ControleTelefone controleTelefone) {
		return telefoneRepository.save(controleTelefone);
	}
}
