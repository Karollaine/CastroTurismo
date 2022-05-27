package br.com.karollaine.domain.pessoa;
import java.io.Serializable;


/*
 * Classe que recebe os dados de pais
 * @author karollaine linhares
 * @version 1.0.0
 * @sine 1.0.0
 */

public class Menoresz extends Pessoa implements  Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Boolean autorizacaoEmbarque ;
	 
	 private String responsavelPassageiro ;
	 
	 private Passageiro passageiro;

	/**
	 * @return the autorizacaoEmbarque
	 */
	public Boolean getAutorizacaoEmbarque() {
		return autorizacaoEmbarque;
	}

	/**
	 * @param autorizacaoEmbarque the autorizacaoEmbarque to set
	 */
	public void setAutorizacaoEmbarque(Boolean autorizacaoEmbarque) {
		this.autorizacaoEmbarque = autorizacaoEmbarque;
	}

	/**
	 * @return the responsavelPassageiro
	 */
	public String getResponsavelPassageiro() {
		return responsavelPassageiro;
	}

	/**
	 * @param responsavelPassageiro the responsavelPassageiro to set
	 */
	public void setResponsavelPassageiro(String responsavelPassageiro) {
		this.responsavelPassageiro = responsavelPassageiro;
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
		result = prime * result + ((autorizacaoEmbarque == null) ? 0 : autorizacaoEmbarque.hashCode());
		result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
		result = prime * result + ((responsavelPassageiro == null) ? 0 : responsavelPassageiro.hashCode());
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
		Menoresz other = (Menoresz) obj;
		if (autorizacaoEmbarque == null) {
			if (other.autorizacaoEmbarque != null)
				return false;
		} else if (!autorizacaoEmbarque.equals(other.autorizacaoEmbarque))
			return false;
		if (passageiro == null) {
			if (other.passageiro != null)
				return false;
		} else if (!passageiro.equals(other.passageiro))
			return false;
		if (responsavelPassageiro == null) {
			if (other.responsavelPassageiro != null)
				return false;
		} else if (!responsavelPassageiro.equals(other.responsavelPassageiro))
			return false;
		return true;
	}
	 
	 
	 
	 
}
	