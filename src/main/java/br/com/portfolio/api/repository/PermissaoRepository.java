package br.com.portfolio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.api.model.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
