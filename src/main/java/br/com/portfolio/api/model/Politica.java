package br.com.portfolio.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_POLITICA")
public class Politica implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPolitica;

	private String nmPolitica;
	
	private String dsPolitica;

	public long getIdPolitica() {
		return idPolitica;
	}

	public void setIdPolitica(long idPolitica) {
		this.idPolitica = idPolitica;
	}

	public String getNmPolitica() {
		return nmPolitica;
	}

	public void setNmPolitica(String nmPolitica) {
		this.nmPolitica = nmPolitica;
	}

	public String getDsPolitica() {
		return dsPolitica;
	}

	public void setDsPolitica(String dsPolitica) {
		this.dsPolitica = dsPolitica;
	}
	
}
