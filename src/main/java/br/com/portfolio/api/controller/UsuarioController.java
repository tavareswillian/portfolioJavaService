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

import br.com.portfolio.api.model.Usuario;
import br.com.portfolio.api.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="usuario")
@Api(value="API REST Usuario")
@CrossOrigin(origins="*")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de usuários")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/{idUsuario}")
	@ApiOperation(value="Retorna um usuário através do seu ID")
	public Optional<Usuario> obtemUsuario(@PathVariable("idUsuario") long idUsuario) {
		return usuarioRepository.findById(idUsuario);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra novo usuário")
	public Usuario cadastraUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove um usuário enviado no corpo da requisição")
	public void removeUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	@DeleteMapping("/{idUsuario}")
	@ApiOperation(value="Remove um usuário através do seu ID")
	public void removeUsuario(@PathVariable("idUsuario") long idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza um usuário enviado no corpo da requisição")
	public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
