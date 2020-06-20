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

import br.com.portfolio.api.model.Repositorio;
import br.com.portfolio.api.repository.RepositorioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("repositorio")
@Api(value="API REST de Repositorios")
@CrossOrigin(origins="*")
public class RepositorioController {
	
	@Autowired
	RepositorioRepository repositorioRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de repositorios")
	public List<Repositorio> listaRepositorios(){
		return repositorioRepository.findAll();
	}
	
	@GetMapping("/{idRepositorio}")
	@ApiOperation(value="Retorna um repositorio através do seu ID")
	public Optional<Repositorio> obtemRepositorio(@PathVariable("idRepositorio") long idRepositorio) {
		return repositorioRepository.findById(idRepositorio);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra novo repositorio")
	public Repositorio cadastraRepositorio(@RequestBody Repositorio repositorio) {
		return repositorioRepository.save(repositorio);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove um repositorio enviado no corpo da requisição")
	public void removeRepositorio(@RequestBody Repositorio repositorio) {
		repositorioRepository.delete(repositorio);
	}
	
	@DeleteMapping("/{idRepositorio}")
	@ApiOperation(value="Remove um repositorio através do seu ID")
	public void removeRepositorio(@PathVariable("idRepositorio") long idRepositorio) {
		repositorioRepository.deleteById(idRepositorio);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza um repositorio enviado no corpo da requisição")
	public Repositorio atualizaRepositorio(@RequestBody Repositorio repositorio) {
		return repositorioRepository.save(repositorio);
	}
}
