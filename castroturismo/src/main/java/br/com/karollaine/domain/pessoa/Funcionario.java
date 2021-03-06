package br.com.karollaine.domain.pessoa;
import java.io.Serializable;


/*
 * Classe que recebe os dados de pais
 * @author karollaine linhares
 * @version 1.0.0
 * @sine 1.0.0
 */

public class Funcionario extends PessoaFisica implements  Serializable {
	
	private Integer numeroDeRegistro;
	
	private Boolean estaAtivo;

	/**
	 * @return the numeroDeRegistro
	 */
	public Integer getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	/**
	 * @param numeroDeRegistro the numeroDeRegistro to set
	 */
	public void setNumeroDeRegistro(Integer numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

	/**
	 * @return the estaAtivo
	 */
	public Boolean getEstaAtivo() {
		return estaAtivo;
	}

	/**
	 * @param estaAtivo the estaAtivo to set
	 */
	public void setEstaAtivo(Boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((estaAtivo == null) ? 0 : estaAtivo.hashCode());
		result = prime * result + ((numeroDeRegistro == null) ? 0 : numeroDeRegistro.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (estaAtivo == null) {
			if (other.estaAtivo != null)
				return false;
		} else if (!estaAtivo.equals(other.estaAtivo))
			return false;
		if (numeroDeRegistro == null) {
			if (other.numeroDeRegistro != null)
				return false;
		} else if (!numeroDeRegistro.equals(other.numeroDeRegistro))
			return false;
		return true;
	}
	
	
	
	

}
