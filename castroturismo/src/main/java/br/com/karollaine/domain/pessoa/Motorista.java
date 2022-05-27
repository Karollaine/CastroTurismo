package br.com.karollaine.domain.pessoa;

public class Motorista {

	private Integer CNH;
	
	private String Categoria;
	
	private Boolean EAR;
	
	private Funcionario funcionario;

	/**
	 * @return the cNH
	 */
	public Integer getCNH() {
		return CNH;
	}

	/**
	 * @param cNH the cNH to set
	 */
	public void setCNH(Integer cNH) {
		CNH = cNH;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return Categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	/**
	 * @return the eAR
	 */
	public Boolean getEAR() {
		return EAR;
	}

	/**
	 * @param eAR the eAR to set
	 */
	public void setEAR(Boolean eAR) {
		EAR = eAR;
	}

	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNH == null) ? 0 : CNH.hashCode());
		result = prime * result + ((Categoria == null) ? 0 : Categoria.hashCode());
		result = prime * result + ((EAR == null) ? 0 : EAR.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorista other = (Motorista) obj;
		if (CNH == null) {
			if (other.CNH != null)
				return false;
		} else if (!CNH.equals(other.CNH))
			return false;
		if (Categoria == null) {
			if (other.Categoria != null)
				return false;
		} else if (!Categoria.equals(other.Categoria))
			return false;
		if (EAR == null) {
			if (other.EAR != null)
				return false;
		} else if (!EAR.equals(other.EAR))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		return true;
	}
	
	
}
