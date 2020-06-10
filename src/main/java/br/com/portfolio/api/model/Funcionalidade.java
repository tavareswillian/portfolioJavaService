package br.com.portfolio.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_FUNCIONALIDADE")
public class Funcionalidade implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idFuncionalidade;
	
	private String nmFuncionalidade;
	
	private String dsFuncionalidade;

	public long getIdFuncionalidade() {
		return idFuncionalidade;
	}

	public void setIdFuncionalidade(long idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

	public String getNmFuncionalidade() {
		return nmFuncionalidade;
	}

	public void setNmFuncionalidade(String nmFuncionalidade) {
		this.nmFuncionalidade = nmFuncionalidade;
	}

	public String getDsFuncionalidade() {
		return dsFuncionalidade;
	}

	public void setDsFuncionalidade(String dsFuncionalidade) {
		this.dsFuncionalidade = dsFuncionalidade;
	}
	
	
}
