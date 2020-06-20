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

import br.com.portfolio.api.model.Documento;
import br.com.portfolio.api.model.Documento;
import br.com.portfolio.api.repository.DocumentoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/documento")
public class DocumentoController {

	@Autowired
	DocumentoRepository documentoRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Retorna uma lista de documentos")
	public List<Documento> listaDocumentos(){
		return documentoRepository.findAll();
	}
	
	@GetMapping("/{idDocumento}")
	@ApiOperation(value="Retorna um documentos através do seu ID")
	public Optional<Documento> obtemDocumento(@PathVariable("idDocumento") long idDocumento) {
		return documentoRepository.findById(idDocumento);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra novo documento")
	public Documento cadastraDocumento(@RequestBody Documento documento) {
		return documentoRepository.save(documento);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove um documento enviado no corpo da requisição")
	public void removeDocumento(@RequestBody Documento documento) {
		documentoRepository.delete(documento);
	}
	
	@DeleteMapping("/{idDocumento}")
	@ApiOperation(value="Remove um documento através do seu ID")
	public void removeDocumento(@PathVariable("idDocumento") long idDocumento) {
		documentoRepository.deleteById(idDocumento);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza um documento enviado no corpo da requisição")
	public Documento atualizaDocumento(@RequestBody Documento documento) {
		return documentoRepository.save(documento);
	}
}
