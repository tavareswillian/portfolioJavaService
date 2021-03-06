package br.com.portfolio.api.util;

import java.io.Serializable;

public class Comparativo implements Serializable{

	private static final long serialVersionUID = 1L;

	private String dsAtributoInicial;
	
	private String dsAtributoFinal;
	
	private Long idAtributo;
	
	private String dsTipoAtributo;

	public String getDsAtributoInicial() {
		return dsAtributoInicial;
	}

	public void setDsAtributoInicial(String dsAtributoInicial) {
		this.dsAtributoInicial = dsAtributoInicial;
	}

	public String getDsAtributoFinal() {
		return dsAtributoFinal;
	}

	public void setDsAtributoFinal(String dsAtributoFinal) {
		this.dsAtributoFinal = dsAtributoFinal;
	}

	public Long getIdAtributo() {
		return idAtributo;
	}

	public void setIdAtributo(Long idAtributo) {
		this.idAtributo = idAtributo;
	}

	public String getDsTipoAtributo() {
		return dsTipoAtributo;
	}

	public void setDsTipoAtributo(String dsTipoAtributo) {
		this.dsTipoAtributo = dsTipoAtributo;
	}
}
