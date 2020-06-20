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

import br.com.portfolio.api.model.Permissao;
import br.com.portfolio.api.repository.PermissaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("permissao")
@Api(value="API REST de Permissões")
@CrossOrigin(origins="*")
public class PermissaoController {

	@Autowired
	PermissaoRepository permissaoRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de permissoes")
	public List<Permissao> listaPermissaos(){
		return permissaoRepository.findAll();
	}
	
	@GetMapping("/{idPermissao}")
	@ApiOperation(value="Retorna uma permissao através do seu ID")
	public Optional<Permissao> obtemPermissao(@PathVariable("idPermissao") long idPermissao) {
		return permissaoRepository.findById(idPermissao);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra nova permissao")
	public Permissao cadastraPermissao(@RequestBody Permissao permissao) {
		return permissaoRepository.save(permissao);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove uma permissao enviada no corpo da requisição")
	public void removePermissao(@RequestBody Permissao permissao) {
		permissaoRepository.delete(permissao);
	}
	
	@DeleteMapping("/{idPermissao}")
	@ApiOperation(value="Remove uma permissao através do seu ID")
	public void removePermissao(@PathVariable("idPermissao") long idPermissao) {
		permissaoRepository.deleteById(idPermissao);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza uma permissao enviada no corpo da requisição")
	public Permissao atualizaPermissao(@RequestBody Permissao permissao) {
		return permissaoRepository.save(permissao);
	}
}
