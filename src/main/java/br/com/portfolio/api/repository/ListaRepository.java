package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long> {

}
