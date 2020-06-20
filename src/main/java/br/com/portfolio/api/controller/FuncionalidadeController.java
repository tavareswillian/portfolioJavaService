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

import br.com.portfolio.api.model.Funcionalidade;
import br.com.portfolio.api.repository.FuncionalidadeRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("funcionalidade")
public class FuncionalidadeController {

	@Autowired
	FuncionalidadeRepository funcionalidadeRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de funcionalidades")
	public List<Funcionalidade> listaFuncionalidades(){
		return funcionalidadeRepository.findAll();
	}
	
	@GetMapping("/{idFuncionalidade}")
	@ApiOperation(value="Retorna uma funcionalidade através do seu ID")
	public Optional<Funcionalidade> obtemFuncionalidade(@PathVariable("idFuncionalidade") long idFuncionalidade) {
		return funcionalidadeRepository.findById(idFuncionalidade);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra nova funcionalidade")
	public Funcionalidade cadastraFuncionalidade(@RequestBody Funcionalidade funcionalidade) {
		return funcionalidadeRepository.save(funcionalidade);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove uma funcionalidade enviada no corpo da requisição")
	public void removeFuncionalidade(@RequestBody Funcionalidade funcionalidade) {
		funcionalidadeRepository.delete(funcionalidade);
	}
	
	@DeleteMapping("/{idFuncionalidade}")
	@ApiOperation(value="Remove uma funcionalidade através do seu ID")
	public void removeFuncionalidade(@PathVariable("idFuncionalidade") long idFuncionalidade) {
		funcionalidadeRepository.deleteById(idFuncionalidade);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza uma funcionalidade enviada no corpo da requisição")
	public Funcionalidade atualizaFuncionalidade(@RequestBody Funcionalidade funcionalidade) {
		return funcionalidadeRepository.save(funcionalidade);
	}
	
}
