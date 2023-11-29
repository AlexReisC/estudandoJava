package collections.dominio;

import java.util.Objects;

public class Smartphone {
	private String serialNumber;
	private String marca;
	
	public Smartphone(String serialNumber, String marca) {
		super();
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartphone other = (Smartphone) obj;
		return serialNumber != null && serialNumber.equals(other.serialNumber);
	}

	@Override
	public String toString() {
		return "Samrtphone [serialNumber=" + serialNumber + ", marca=" + marca + "]";
	}
	
}
