import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Attivita extends Compito{
	private int costo;

	public Attivita(String nome, String responsabile, int costo) {
		super(nome,responsabile);
		this.costo = costo;
	}

	@Override
	public int getCosto() { 
		return this.costo; 
	}
	
	public int hashCode() { 
		return this.getNome().hashCode(); 
	}
	public boolean equals(Object obj) {
		Attivita attivita = (Attivita)obj;
		return this.getNome().equals(attivita.getNome());
	}

	@Override
	public Map<String, List<Compito>> responsabile2compito() {
		Map<String, List<Compito>> mappa = new HashMap<String, List<Compito>>();
		List<Compito> compitino = new LinkedList<Compito>();
		compitino.add(this);
		mappa.put(this.getResponsabile(), compitino);
		return mappa;
	}
}
