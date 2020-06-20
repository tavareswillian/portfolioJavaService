package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Duvida;

public interface DuvidaRepository extends JpaRepository<Duvida, Long> {

}
