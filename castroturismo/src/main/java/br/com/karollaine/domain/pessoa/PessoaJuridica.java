package br.com.karollaine.domain.pessoa;
import java.io.Serializable;
import java.util.Date;

/*
 * Classe que recebe os dados de pais
 * @author karollaine linhares
 * @version 1.0.0
 * @sine 1.0.0
 */

public class PessoaJuridica extends Pessoa implements  Serializable {
	
    private Integer CNPJ;
	
	private Integer inscricaoEstadual;
	
	private Date dataAbertura;

	/**
	 * @return the cNPJ
	 */
	public Integer getCNPJ() {
		return CNPJ;
	}

	/**
	 * @param cNPJ the cNPJ to set
	 */
	public void setCNPJ(Integer cNPJ) {
		CNPJ = cNPJ;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public Integer getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(Integer inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/**
	 * @return the dataAbertura
	 */
	public Date getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		result = prime * result + ((dataAbertura == null) ? 0 : dataAbertura.hashCode());
		result = prime * result + ((inscricaoEstadual == null) ? 0 : inscricaoEstadual.hashCode());
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
		PessoaJuridica other = (PessoaJuridica) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		if (dataAbertura == null) {
			if (other.dataAbertura != null)
				return false;
		} else if (!dataAbertura.equals(other.dataAbertura))
			return false;
		if (inscricaoEstadual == null) {
			if (other.inscricaoEstadual != null)
				return false;
		} else if (!inscricaoEstadual.equals(other.inscricaoEstadual))
			return false;
		return true;
	}
	
	


}
