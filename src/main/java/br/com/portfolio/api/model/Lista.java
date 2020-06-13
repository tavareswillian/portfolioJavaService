package br.com.portfolio.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_LISTA")
public class Lista implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idLista;
	
	private String nmLista;
	
	private String dsLista;

	public long getIdLista() {
		return idLista;
	}

	public void setIdLista(long idLista) {
		this.idLista = idLista;
	}

	public String getNmLista() {
		return nmLista;
	}

	public void setNmLista(String nmLista) {
		this.nmLista = nmLista;
	}

	public String getDsLista() {
		return dsLista;
	}

	public void setDsLista(String dsLista) {
		this.dsLista = dsLista;
	}
}
