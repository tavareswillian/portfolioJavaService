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

import br.com.portfolio.api.model.Duvida;
import br.com.portfolio.api.repository.DuvidaRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("duvida")
public class DuvidaController {

	@Autowired
	DuvidaRepository duvidaRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de duvidas")
	public List<Duvida> listaDuvidas(){
		return duvidaRepository.findAll();
	}
	
	@GetMapping("/{idDuvida}")
	@ApiOperation(value="Retorna um duvidas através do seu ID")
	public Optional<Duvida> obtemDuvida(@PathVariable("idDuvida") long idDuvida) {
		return duvidaRepository.findById(idDuvida);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra novo duvida")
	public Duvida cadastraDuvida(@RequestBody Duvida duvida) {
		return duvidaRepository.save(duvida);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove um duvida enviado no corpo da requisição")
	public void removeDuvida(@RequestBody Duvida duvida) {
		duvidaRepository.delete(duvida);
	}
	
	@DeleteMapping("/{idDuvida}")
	@ApiOperation(value="Remove um duvida através do seu ID")
	public void removeDuvida(@PathVariable("idDuvida") long idDuvida) {
		duvidaRepository.deleteById(idDuvida);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza um duvida enviado no corpo da requisição")
	public Duvida atualizaDuvida(@RequestBody Duvida duvida) {
		return duvidaRepository.save(duvida);
	}
}
