package collections.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
	private Long id;
	private String name;
	
	public Consumidor( String name) {
		super();
		this.id = ThreadLocalRandom.current().nextLong(0, 100000);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Consumidor [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(id, other.id);
	}
	
	public String getName() {
		return name;
	}
	
}
