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

import br.com.portfolio.api.model.Repositorio;
import br.com.portfolio.api.repository.RepositorioRepository;

@RestController
@RequestMapping("repositorio")
public class RepositorioController {
	
	@Autowired
	RepositorioRepository repositorioRepository;
	
	@GetMapping("/listar")
	public List<Repositorio> listarRepositorio(){
		return repositorioRepository.findAll();
	}
	
	@GetMapping("/{idRepositorio}")
	public Optional<Repositorio> consultaRepositorio(@PathVariable("idRepositorio") Long idRepositorio) {
		return repositorioRepository.findById(idRepositorio);
	}
	
	@PostMapping
	public Repositorio cadastraRepositorio(@RequestBody Repositorio repositorio) {
		return repositorioRepository.save(repositorio);
	}
	
	@PutMapping
	public Repositorio atualizaRepositorio(@RequestBody Repositorio repositorio) {
		return repositorioRepository.save(repositorio);
	}
	
	@DeleteMapping
	public void removeRepositorio(@RequestBody Repositorio repositorio) {
		repositorioRepository.delete(repositorio);
	}
	
	@DeleteMapping("/{idRepositorio}")
	public void removeRepositorioById(@PathVariable("idRepositorio") Long idRepositorio) {
		repositorioRepository.deleteById(idRepositorio);
	}
}
