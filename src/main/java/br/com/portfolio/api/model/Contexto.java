package br.com.portfolio.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CONTEXTO")
public class Contexto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idContexto;
	
	private String nmContexto;
	
	private String dsContexto;


	public long getIdContexto() {
		return idContexto;
	}

	public void setIdContexto(long idContexto) {
		this.idContexto = idContexto;
	}

	public String getNmContexto() {
		return nmContexto;
	}

	public void setNmContexto(String nmContexto) {
		this.nmContexto = nmContexto;
	}

	public String getDsContexto() {
		return dsContexto;
	}

	public void setDsContexto(String dsContexto) {
		this.dsContexto = dsContexto;
	}

}
