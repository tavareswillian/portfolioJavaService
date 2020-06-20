package br.com.portfolio.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.portfolio.api.util.Comparativo;

@Entity
@Table(name="TB_EVENTO")
public class Evento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idDuvida;
	
	private String nmEvento;
	
	private Lista listaParticipantesEvento;
	
	private String dsTipoEvento;
	
	private Date dtEvento;
	
	private long nbDuracaoEvento;
	
	private String localEvento;
	
	private String dsClimaEvento;
	
	private String dsAvaliacaoHumor;
	
	private Comparativo comparativo;

	public long getIdDuvida() {
		return idDuvida;
	}

	public void setIdDuvida(long idDuvida) {
		this.idDuvida = idDuvida;
	}

	public String getNmEvento() {
		return nmEvento;
	}

	public void setNmEvento(String nmEvento) {
		this.nmEvento = nmEvento;
	}

	public Lista getListaParticipantesEvento() {
		return listaParticipantesEvento;
	}

	public void setListaParticipantesEvento(Lista listaParticipantesEvento) {
		this.listaParticipantesEvento = listaParticipantesEvento;
	}

	public String getDsTipoEvento() {
		return dsTipoEvento;
	}

	public void setDsTipoEvento(String dsTipoEvento) {
		this.dsTipoEvento = dsTipoEvento;
	}

	public Date getDtEvento() {
		return dtEvento;
	}

	public void setDtEvento(Date dtEvento) {
		this.dtEvento = dtEvento;
	}

	public long getNbDuracaoEvento() {
		return nbDuracaoEvento;
	}

	public void setNbDuracaoEvento(long nbDuracaoEvento) {
		this.nbDuracaoEvento = nbDuracaoEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public String getDsClimaEvento() {
		return dsClimaEvento;
	}

	public void setDsClimaEvento(String dsClimaEvento) {
		this.dsClimaEvento = dsClimaEvento;
	}

	public String getDsAvaliacaoHumor() {
		return dsAvaliacaoHumor;
	}

	public void setDsAvaliacaoHumor(String dsAvaliacaoHumor) {
		this.dsAvaliacaoHumor = dsAvaliacaoHumor;
	}

	public Comparativo getComparativo() {
		return comparativo;
	}

	public void setComparativo(Comparativo comparativo) {
		this.comparativo = comparativo;
	}
}
