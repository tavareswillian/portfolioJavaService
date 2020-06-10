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

import br.com.portfolio.api.model.Permissao;
import br.com.portfolio.api.repository.PermissaoRepository;

@RestController
@RequestMapping("permissao")
public class PermissaoController {

	@Autowired
	PermissaoRepository permissaoRepository;
	
	@GetMapping("/listar")
	public List<Permissao> listarPermissao() {
		return permissaoRepository.findAll();
	}
	
	@GetMapping("{idPermissao}")
	public Optional<Permissao> obtemPermissao(@PathVariable("idPermissao") long idPermissao) {
		return permissaoRepository.findById(idPermissao);
	}
	
	@PostMapping
	public Permissao cadastraPermissao(@RequestBody Permissao permissao) {
		return permissaoRepository.save(permissao);
	}
	
	@DeleteMapping
	public void removePermissao(@RequestBody Permissao permissao) {
		permissaoRepository.delete(permissao);
	}
	
	@DeleteMapping("/{idPermissao}")
	public void removePermissaoById(@PathVariable("idPermissao") long idPermissao) {
		permissaoRepository.deleteById(idPermissao);
	}
	
	@PutMapping
	public Permissao atualizaPermissao(@RequestBody Permissao permissao) {
		return permissaoRepository.save(permissao);
	}
}
