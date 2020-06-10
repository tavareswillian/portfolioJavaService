package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Politica;

public interface PoliticaRepository extends JpaRepository<Politica, Long> {

}
