package br.com.portfolio.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfolio.api.model.Funcionalidade;
import br.com.portfolio.api.repository.FuncionalidadeRepository;

@RestController
@RequestMapping("funcionalidade")
public class FuncionalidadeController {

	@Autowired
	FuncionalidadeRepository funcionalidadeRepository;
	
	@GetMapping("/listar")
	public List<Funcionalidade> listarFuncionalidade() {
		return funcionalidadeRepository.findAll();
	}
	
	@GetMapping("{idFuncionalidade}")
	public Optional<Funcionalidade> obtemFuncionalidade(@PathVariable("idFuncionalidade") long idFuncionalidade) {
		return funcionalidadeRepository.findById(idFuncionalidade);
	}
	
	@PostMapping
	public Funcionalidade cadastraFuncionalidade(@RequestBody Funcionalidade funcionalidade) {
		return funcionalidadeRepository.save(funcionalidade);
	}
	
	@DeleteMapping
	public void removeFuncionalidade(@RequestBody Funcionalidade funcionalidade) {
		funcionalidadeRepository.delete(funcionalidade);
	}
	
	@DeleteMapping("/{idFuncionalidade}")
	public void removeFuncionalidadeById(@PathVariable("idFuncionalidade") long idFuncionalidade) {
		funcionalidadeRepository.deleteById(idFuncionalidade);
	}
	
	@PutMapping
	public Funcionalidade atualizaFuncionalidade(@RequestBody Funcionalidade funcionalidade) {
		return funcionalidadeRepository.save(funcionalidade);
	}
}
