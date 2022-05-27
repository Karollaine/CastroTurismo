package br.com.karollaine.domain.pessoa;
import java.io.Serializable;


/*
 * Classe que recebe os dados de pais
 * @author karollaine linhares
 * @version 1.0.0
 * @sine 1.0.0
 */

public class Rodoviaria extends PessoaJuridica implements  Serializable { 
	
	private Integer horaAbertura;
	
	private String horaFechamento;
	
	private Double taxaDeEmbarque;

	/**
	 * @return the horaAbertura
	 */
	public Integer getHoraAbertura() {
		return horaAbertura;
	}

	/**
	 * @param horaAbertura the horaAbertura to set
	 */
	public void setHoraAbertura(Integer horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	/**
	 * @return the horaFechamento
	 */
	public String getHoraFechamento() {
		return horaFechamento;
	}

	/**
	 * @param horaFechamento the horaFechamento to set
	 */
	public void setHoraFechamento(String horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	/**
	 * @return the taxaDeEmbarque
	 */
	public Double getTaxaDeEmbarque() {
		return taxaDeEmbarque;
	}

	/**
	 * @param taxaDeEmbarque the taxaDeEmbarque to set
	 */
	public void setTaxaDeEmbarque(Double taxaDeEmbarque) {
		this.taxaDeEmbarque = taxaDeEmbarque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((horaAbertura == null) ? 0 : horaAbertura.hashCode());
		result = prime * result + ((horaFechamento == null) ? 0 : horaFechamento.hashCode());
		result = prime * result + ((taxaDeEmbarque == null) ? 0 : taxaDeEmbarque.hashCode());
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
		Rodoviaria other = (Rodoviaria) obj;
		if (horaAbertura == null) {
			if (other.horaAbertura != null)
				return false;
		} else if (!horaAbertura.equals(other.horaAbertura))
			return false;
		if (horaFechamento == null) {
			if (other.horaFechamento != null)
				return false;
		} else if (!horaFechamento.equals(other.horaFechamento))
			return false;
		if (taxaDeEmbarque == null) {
			if (other.taxaDeEmbarque != null)
				return false;
		} else if (!taxaDeEmbarque.equals(other.taxaDeEmbarque))
			return false;
		return true;
	}
	
	
	
}
	
