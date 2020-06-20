package br.com.portfolio.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_REPOSITORIO")
public class Repositorio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idRepositorio;
	
	private String nmRepositorio;
	
	private String dsEnderecoRepositorio;
	
	private String tipoRepositorio;
	
	private String flagUtilizarSSL;

	public long getIdRepositorio() {
		return idRepositorio;
	}

	public void setIdRepositorio(long idRepositorio) {
		this.idRepositorio = idRepositorio;
	}

	public String getNmRepositorio() {
		return nmRepositorio;
	}

	public void setNmRepositorio(String nmRepositorio) {
		this.nmRepositorio = nmRepositorio;
	}

	public String getDsEnderecoRepositorio() {
		return dsEnderecoRepositorio;
	}

	public void setDsEnderecoRepositorio(String dsEnderecoRepositorio) {
		this.dsEnderecoRepositorio = dsEnderecoRepositorio;
	}

	public String getTipoRepositorio() {
		return tipoRepositorio;
	}

	public void setTipoRepositorio(String tipoRepositorio) {
		this.tipoRepositorio = tipoRepositorio;
	}

	public String getFlagUtilizarSSL() {
		return flagUtilizarSSL;
	}

	public void setFlagUtilizarSSL(String flagUtilizarSSL) {
		this.flagUtilizarSSL = flagUtilizarSSL;
	}

}
