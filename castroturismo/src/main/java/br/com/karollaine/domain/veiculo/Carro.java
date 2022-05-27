package br.com.karollaine.domain.veiculo;
import java.io.Serializable;

public class Carro extends Veiculo implements Serializable {
	
	public SetorEnum Setor;

	/**
	 * @return the setor
	 */
	public SetorEnum getSetor() {
		return Setor;
	}

	/**
	 * @param setor the setor to set
	 */
	public void setSetor(SetorEnum setor) {
		Setor = setor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Setor == null) ? 0 : Setor.hashCode());
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
		Carro other = (Carro) obj;
		if (Setor != other.Setor)
			return false;
		return true;
	}
	
	

}
