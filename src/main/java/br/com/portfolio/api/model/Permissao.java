package br.com.portfolio.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_PERMISSAO")
public class Permissao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPermissao;
	
	private String nmPermissao;
	
	@OneToMany(targetEntity=Funcionalidade.class )
	private List<Funcionalidade> funcionalidade;
	
	public List<Funcionalidade> getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(List<Funcionalidade> funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public long getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(long idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getNmPermissao() {
		return nmPermissao;
	}

	public void setNmPermissao(String nmPermissao) {
		this.nmPermissao = nmPermissao;
	}
	
	
}
