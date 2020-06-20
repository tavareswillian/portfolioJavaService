package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Repositorio;

public interface RepositorioRepository extends JpaRepository<Repositorio, Long> {

}
