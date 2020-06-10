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

import br.com.portfolio.api.model.Perfil;
import br.com.portfolio.api.repository.PerfilRepository;

@RestController
@RequestMapping("perfil")
public class PerfilController {

	@Autowired
	PerfilRepository perfilRepository;
	
	@GetMapping("/listar")
	public List<Perfil> listaPerfil(){
		return perfilRepository.findAll();
	}
	
	@GetMapping("/{idPerfil}")
	public Optional<Perfil> obtemPerfil(@PathVariable("idPerfil") long idPerfil) {
		return perfilRepository.findById(idPerfil);
	}
	
	@PostMapping
	public Perfil cadastraPerfil(@RequestBody Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	@DeleteMapping
	public void removePerfil(@RequestBody Perfil perfil) {
		perfilRepository.delete(perfil);
	}
	
	@DeleteMapping("/{idPerfil}")
	public void removePerfilById(@PathVariable("idPerfil") long idPerfil) {
		perfilRepository.deleteById(idPerfil);
	}
	
	@PutMapping
	public Perfil atualizaPerfil(Perfil perfil){
		return perfilRepository.save(perfil);
	}
}
