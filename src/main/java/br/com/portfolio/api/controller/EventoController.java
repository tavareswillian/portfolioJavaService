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

import br.com.portfolio.api.model.Evento;
import br.com.portfolio.api.repository.EventoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("evento")
public class EventoController {

	@Autowired
	EventoRepository eventoRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de eventos")
	public List<Evento> listaEventos(){
		return eventoRepository.findAll();
	}
	
	@GetMapping("/{idEvento}")
	@ApiOperation(value="Retorna um evento através do seu ID")
	public Optional<Evento> obtemEvento(@PathVariable("idEvento") long idEvento) {
		return eventoRepository.findById(idEvento);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra novo evento")
	public Evento cadastraEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove um evento enviado no corpo da requisição")
	public void removeEvento(@RequestBody Evento evento) {
		eventoRepository.delete(evento);
	}
	
	@DeleteMapping("/{idEvento}")
	@ApiOperation(value="Remove um evento através do seu ID")
	public void removeEvento(@PathVariable("idEvento") long idEvento) {
		eventoRepository.deleteById(idEvento);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza um evento enviado no corpo da requisição")
	public Evento atualizaEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	}
	
}
