import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Progetto extends Compito{
	private List<Compito> elencoCompiti;
	
	public Progetto(String nome, String responsabile) {
		super(nome,responsabile);
		this.elencoCompiti = new ArrayList<Compito>();
	}
	
	public void addCompito(Compito compito) { 
		this.elencoCompiti.add(compito); 
		Collections.sort(elencoCompiti, new ComparatoreProgetto());
	}
	
	public int getCosto() {
		int costo = 0;
		for(Compito compito : this.elencoCompiti)
			costo += compito.getCosto();
		return costo;
	}
	
	public int hashCode() { 
		return this.getNome().hashCode(); 
	}
	public boolean equals(Object obj) {
		Progetto progetto = (Progetto)obj;
		return this.getNome().equals(progetto.getNome());
	}
	
	@Override
	public Map<String, List<Compito>> responsabile2compito(){
		Map<String, List<Compito>> resp2attivita = new HashMap<String, List<Compito>>();
		for(Compito compito : elencoCompiti ) {
			if(resp2attivita.containsKey(compito.getResponsabile())) {
				resp2attivita.get(compito.getResponsabile()).add(compito);
			}
			else {
				List<Compito> listaCompitiDaAggiungere = new LinkedList<Compito>();
				listaCompitiDaAggiungere.add(compito);
				resp2attivita.put(compito.getResponsabile(),listaCompitiDaAggiungere);
			}
		}
		return resp2attivita;
	}
}
