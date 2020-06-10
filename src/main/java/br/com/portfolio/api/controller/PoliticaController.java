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

import br.com.portfolio.api.model.Politica;
import br.com.portfolio.api.repository.PoliticaRepository;

@RestController
@RequestMapping("politica")
public class PoliticaController {

	@Autowired
	PoliticaRepository politicaRepository;
	
	@GetMapping("/listar")
	public List<Politica> listarPolitica() {
		return politicaRepository.findAll();
	}
	
	@GetMapping("{idPolitica}")
	public Optional<Politica> obtemPolitica(@PathVariable("idPolitica") long idPolitica) {
		return politicaRepository.findById(idPolitica);
	}
	
	@PostMapping
	public Politica cadastraPolitica(@RequestBody Politica politica) {
		return politicaRepository.save(politica);
	}
	
	@DeleteMapping
	public void removePolitica(@RequestBody Politica politica) {
		politicaRepository.delete(politica);
	}
	
	@DeleteMapping("/{idPolitica}")
	public void removePoliticaById(@PathVariable("idPolitica") long idPolitica) {
		politicaRepository.deleteById(idPolitica);
	}
	
	@PutMapping
	public Politica atualizaPolitica(@RequestBody Politica politica) {
		return politicaRepository.save(politica);
	}
	
}
