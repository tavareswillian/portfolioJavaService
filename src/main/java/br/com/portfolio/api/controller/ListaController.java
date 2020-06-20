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

import br.com.portfolio.api.model.Lista;
import br.com.portfolio.api.repository.ListaRepository;

@RestController
@RequestMapping("lista")
public class ListaController{

	@Autowired
	ListaRepository listaRepository;

	@GetMapping("/listar")
	public List<Lista> listarListas() {
		return listaRepository.findAll();
	}
	
	@GetMapping("/{idLista}")
	public Optional<Lista> retornaLista(@PathVariable("idLista") Long idLista) {
		return listaRepository.findById(idLista);
	}
	
	@PostMapping
	public Lista cadastraLista(@RequestBody Lista lista) {
		return listaRepository.save(lista);
	}
	
	@PutMapping
	public Lista atualizaLista(@RequestBody Lista lista) {
		return listaRepository.save(lista);
	}
	
	@DeleteMapping
	public void removeLista(@RequestBody Lista lista) {
		listaRepository.delete(lista);
	}
	
	@DeleteMapping("/{idLista")
	public void removeLista(@PathVariable("idLista") Long idLista) {
		listaRepository.deleteById(idLista);
	}
}
