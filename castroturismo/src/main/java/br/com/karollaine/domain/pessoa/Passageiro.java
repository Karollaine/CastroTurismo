package br.com.karollaine.domain.pessoa;
import java.io.Serializable;


/*
 * Classe que recebe os dados de pais
 * @author karollaine linhares
 * @version 1.0.0
 * @sine 1.0.0
 */

public class Passageiro extends Pessoa implements  Serializable {
	
	private Integer NumeroCartao;
	
	private String ValidadeCartao;
	
	private Integer seguranca;

	/**
	 * @return the numeroCartao
	 */
	public Integer getNumeroCartao() {
		return NumeroCartao;
	}

	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(Integer numeroCartao) {
		NumeroCartao = numeroCartao;
	}

	/**
	 * @return the validadeCartao
	 */
	public String getValidadeCartao() {
		return ValidadeCartao;
	}

	/**
	 * @param validadeCartao the validadeCartao to set
	 */
	public void setValidadeCartao(String validadeCartao) {
		ValidadeCartao = validadeCartao;
	}

	/**
	 * @return the seguranca
	 */
	public Integer getSeguranca() {
		return seguranca;
	}

	/**
	 * @param seguranca the seguranca to set
	 */
	public void setSeguranca(Integer seguranca) {
		this.seguranca = seguranca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((NumeroCartao == null) ? 0 : NumeroCartao.hashCode());
		result = prime * result + ((ValidadeCartao == null) ? 0 : ValidadeCartao.hashCode());
		result = prime * result + ((seguranca == null) ? 0 : seguranca.hashCode());
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
		Passageiro other = (Passageiro) obj;
		if (NumeroCartao == null) {
			if (other.NumeroCartao != null)
				return false;
		} else if (!NumeroCartao.equals(other.NumeroCartao))
			return false;
		if (ValidadeCartao == null) {
			if (other.ValidadeCartao != null)
				return false;
		} else if (!ValidadeCartao.equals(other.ValidadeCartao))
			return false;
		if (seguranca == null) {
			if (other.seguranca != null)
				return false;
		} else if (!seguranca.equals(other.seguranca))
			return false;
		return true;
	}
	
	
}