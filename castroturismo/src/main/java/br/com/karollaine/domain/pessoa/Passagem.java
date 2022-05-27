package br.com.karollaine.domain.pessoa;
import java.io.Serializable;


/*
 * Classe que recebe os dados de pais
 * @author karollaine linhares
 * @version 1.0.0
 * @sine 1.0.0
 */

public class Passagem implements  Serializable {
	
	private Integer id ;
	
	private Integer numeroPassagem ;
	
	private FormaPagamentoEnum formaDePagamento;
	
	private Boolean possuiBagagem ;
	
	private Integer numeroPoltrona ;
	
	private Passageiro passageiro;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the numeroPassagem
	 */
	public Integer getNumeroPassagem() {
		return numeroPassagem;
	}

	/**
	 * @param numeroPassagem the numeroPassagem to set
	 */
	public void setNumeroPassagem(Integer numeroPassagem) {
		this.numeroPassagem = numeroPassagem;
	}

	/**
	 * @return the formaDePagamento
	 */
	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	/**
	 * @param formaDePagamento the formaDePagamento to set
	 */
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	/**
	 * @return the possuiBagagem
	 */
	public Boolean getPossuiBagagem() {
		return possuiBagagem;
	}

	/**
	 * @param possuiBagagem the possuiBagagem to set
	 */
	public void setPossuiBagagem(Boolean possuiBagagem) {
		this.possuiBagagem = possuiBagagem;
	}

	/**
	 * @return the numeroPoltrona
	 */
	public Integer getNumeroPoltrona() {
		return numeroPoltrona;
	}

	/**
	 * @param numeroPoltrona the numeroPoltrona to set
	 */
	public void setNumeroPoltrona(Integer numeroPoltrona) {
		this.numeroPoltrona = numeroPoltrona;
	}

	/**
	 * @return the passageiro
	 */
	public Passageiro getPassageiro() {
		return passageiro;
	}

	/**
	 * @param passageiro the passageiro to set
	 */
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((formaDePagamento == null) ? 0 : formaDePagamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroPassagem == null) ? 0 : numeroPassagem.hashCode());
		result = prime * result + ((numeroPoltrona == null) ? 0 : numeroPoltrona.hashCode());
		result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
		result = prime * result + ((possuiBagagem == null) ? 0 : possuiBagagem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passagem other = (Passagem) obj;
		if (formaDePagamento == null) {
			if (other.formaDePagamento != null)
				return false;
		} else if (!formaDePagamento.equals(other.formaDePagamento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroPassagem == null) {
			if (other.numeroPassagem != null)
				return false;
		} else if (!numeroPassagem.equals(other.numeroPassagem))
			return false;
		if (numeroPoltrona == null) {
			if (other.numeroPoltrona != null)
				return false;
		} else if (!numeroPoltrona.equals(other.numeroPoltrona))
			return false;
		if (passageiro == null) {
			if (other.passageiro != null)
				return false;
		} else if (!passageiro.equals(other.passageiro))
			return false;
		if (possuiBagagem == null) {
			if (other.possuiBagagem != null)
				return false;
		} else if (!possuiBagagem.equals(other.possuiBagagem))
			return false;
		return true;
	}
	
	
}
	