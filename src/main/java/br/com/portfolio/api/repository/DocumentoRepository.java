package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
