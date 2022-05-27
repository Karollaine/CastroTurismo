package br.com.karollaine.domain.pessoa;
import java.io.Serializable;
import java.util.Date;

/*
 * Classe que recebe os dados de pais
 * @author karollaine linhares
 * @version 1.0.0
 * @sine 1.0.0
 */


public class PessoaFisica extends Pessoa implements  Serializable {
	
	private Integer CPF;
	
	private Integer RG;
	
	private String orgaoEmissor;
	
	private Date DataNascimento;

	/**
	 * @return the cPF
	 */
	public Integer getCPF() {
		return CPF;
	}

	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	/**
	 * @return the rG
	 */
	public Integer getRG() {
		return RG;
	}

	/**
	 * @param rG the rG to set
	 */
	public void setRG(Integer rG) {
		RG = rG;
	}

	/**
	 * @return the orgaoEmissor
	 */
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	/**
	 * @param orgaoEmissor the orgaoEmissor to set
	 */
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return DataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((DataNascimento == null) ? 0 : DataNascimento.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		result = prime * result + ((orgaoEmissor == null) ? 0 : orgaoEmissor.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (DataNascimento == null) {
			if (other.DataNascimento != null)
				return false;
		} else if (!DataNascimento.equals(other.DataNascimento))
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		if (orgaoEmissor == null) {
			if (other.orgaoEmissor != null)
				return false;
		} else if (!orgaoEmissor.equals(other.orgaoEmissor))
			return false;
		return true;
	}
	
	/*
	 * 
	 */
	
	
	

}
