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

import br.com.portfolio.api.model.Perfil;
import br.com.portfolio.api.repository.PerfilRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("perfil")
@Api(value="API REST de Perfis")
@CrossOrigin(origins="*")
public class PerfilController {

	@Autowired
	PerfilRepository perfilRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de perfils")
	public List<Perfil> listaPerfils(){
		return perfilRepository.findAll();
	}
	
	@GetMapping("/{idPerfil}")
	@ApiOperation(value="Retorna um perfil através do seu ID")
	public Optional<Perfil> obtemPerfil(@PathVariable("idPerfil") long idPerfil) {
		return perfilRepository.findById(idPerfil);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra novo perfil")
	public Perfil cadastraPerfil(@RequestBody Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove um perfil enviado no corpo da requisição")
	public void removePerfil(@RequestBody Perfil perfil) {
		perfilRepository.delete(perfil);
	}
	
	@DeleteMapping("/{idPerfil}")
	@ApiOperation(value="Remove um perfil através do seu ID")
	public void removePerfil(@PathVariable("idPerfil") long idPerfil) {
		perfilRepository.deleteById(idPerfil);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza um perfil enviado no corpo da requisição")
	public Perfil atualizaPerfil(@RequestBody Perfil perfil) {
		return perfilRepository.save(perfil);
	}
}
