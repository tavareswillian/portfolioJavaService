package br.com.portfolio.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_DUVIDA")
public class Duvida implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idDuvida;
	
	private String nmTitulo;
	
	private String dsConteudo;
	
	private String dsTipoDuvida;

	public long getIdDuvida() {
		return idDuvida;
	}

	public void setIdDuvida(long idDuvida) {
		this.idDuvida = idDuvida;
	}

	public String getNmTitulo() {
		return nmTitulo;
	}

	public void setNmTitulo(String nmTitulo) {
		this.nmTitulo = nmTitulo;
	}

	public String getDsConteudo() {
		return dsConteudo;
	}

	public void setDsConteudo(String dsConteudo) {
		this.dsConteudo = dsConteudo;
	}

	public String getDsTipoDuvida() {
		return dsTipoDuvida;
	}

	public void setDsTipoDuvida(String dsTipoDuvida) {
		this.dsTipoDuvida = dsTipoDuvida;
	}
}
