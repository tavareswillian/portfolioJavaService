package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
