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

import br.com.portfolio.api.model.Usuario;
import br.com.portfolio.api.repository.UsuarioRepository;

@RestController
@RequestMapping(value="usuario")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/listar")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/{idUsuario}")
	public Optional<Usuario> obtemUsuario(@PathVariable("idUsuario") long idUsuario) {
		return usuarioRepository.findById(idUsuario);
	}
	
	@PostMapping("/usuario")
	public Usuario cadastraUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/usuario")
	public void removeUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	@DeleteMapping("/{idUsuario}")
	public void removeUsuario(@PathVariable("idUsuario") long idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}
	
	@PutMapping("/usuario")
	public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
