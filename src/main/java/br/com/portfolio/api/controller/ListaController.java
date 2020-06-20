package br.com.portfolio.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("lista")
@Api(value="API REST de Listas")
@CrossOrigin(origins="*")
public class ListaController{

	@Autowired
	ListaRepository listaRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de listas")
	public List<Lista> listaListas(){
		return listaRepository.findAll();
	}
	
	@GetMapping("/{idLista}")
	@ApiOperation(value="Retorna uma lista através do seu ID")
	public Optional<Lista> obtemLista(@PathVariable("idLista") long idLista) {
		return listaRepository.findById(idLista);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra nova lista")
	public Lista cadastraLista(@RequestBody Lista lista) {
		return listaRepository.save(lista);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove uma lista enviada no corpo da requisição")
	public void removeLista(@RequestBody Lista lista) {
		listaRepository.delete(lista);
	}
	
	@DeleteMapping("/{idLista}")
	@ApiOperation(value="Remove uma lista através do seu ID")
	public void removeLista(@PathVariable("idLista") long idLista) {
		listaRepository.deleteById(idLista);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza uma lista enviada no corpo da requisição")
	public Lista atualizaLista(@RequestBody Lista lista) {
		return listaRepository.save(lista);
	}
}
