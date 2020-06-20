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

import br.com.portfolio.api.model.Politica;
import br.com.portfolio.api.repository.PoliticaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("politica")
@Api(value="API REST de Politicas")
@CrossOrigin(origins="*")
public class PoliticaController {

	@Autowired
	PoliticaRepository politicaRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de politicas")
	public List<Politica> listaPoliticas(){
		return politicaRepository.findAll();
	}
	
	@GetMapping("/{idPolitica}")
	@ApiOperation(value="Retorna uma politica através do seu ID")
	public Optional<Politica> obtemPolitica(@PathVariable("idPolitica") long idPolitica) {
		return politicaRepository.findById(idPolitica);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra nova politica")
	public Politica cadastraPolitica(@RequestBody Politica politica) {
		return politicaRepository.save(politica);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove uma politica enviada no corpo da requisição")
	public void removePolitica(@RequestBody Politica politica) {
		politicaRepository.delete(politica);
	}
	
	@DeleteMapping("/{idPolitica}")
	@ApiOperation(value="Remove uma politica através do seu ID")
	public void removePolitica(@PathVariable("idPolitica") long idPolitica) {
		politicaRepository.deleteById(idPolitica);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza uma politica enviada no corpo da requisição")
	public Politica atualizaPolitica(@RequestBody Politica politica) {
		return politicaRepository.save(politica);
	}
	
}
