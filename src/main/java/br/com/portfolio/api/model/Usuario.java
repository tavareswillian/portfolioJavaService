package br.com.portfolio.api.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUsuario;
	
	private String nmLogin;
	
	private String nmUsuario;
	
	private String dsSenha;
	
	private String flStatusSessao;
	
	@ManyToOne
	@JoinColumn(name="idPerfil")
	private Perfil perfil;
	
	private String idSessao;
	
	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNmLogin() {
		return nmLogin;
	}

	public void setNmLogin(String nmLogin) {
		this.nmLogin = nmLogin;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public String getDsSenha() {
		return dsSenha;
	}

	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}

	public String getFlStatusSessao() {
		return flStatusSessao;
	}

	public void setFlStatusSessao(String flStatusSessao) {
		this.flStatusSessao = flStatusSessao;
	}

	public String getIdSessao() {
		return idSessao;
	}

	public void setIdSessao(String idSessao) {
		this.idSessao = idSessao;
	}

}
