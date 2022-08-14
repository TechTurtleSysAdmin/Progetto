import java.util.*;
public abstract class Compito {
	
	private String nome;
	private String responsabile;
	
	public Compito(String nome, String responsabile) {
		this.nome = nome; this.responsabile = responsabile;
	}
	
	public String getNome() { 
		return this.nome; 
	}
	public abstract int getCosto();
	
	public String getResponsabile() { 
		return this.responsabile; 
	}
	public void setResponsabile(String responsabile) { 
		this.responsabile = responsabile; 
	}
	
	public abstract Map<String, List<Compito>> responsabile2compito();
	
	public int hashCode() { 
		return this.nome.hashCode(); 
	}
	public boolean equals(Object obj) {
		Compito compito = (Compito)obj;
		return this.nome.equals(compito.getNome());
	}
}