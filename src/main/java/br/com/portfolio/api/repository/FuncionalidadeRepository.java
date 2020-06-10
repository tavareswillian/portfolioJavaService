package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Funcionalidade;

public interface FuncionalidadeRepository extends JpaRepository<Funcionalidade, Long> {

}
