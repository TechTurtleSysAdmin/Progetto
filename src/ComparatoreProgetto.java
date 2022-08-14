import java.util.Comparator;



public class ComparatoreProgetto implements Comparator<Compito>{

	public int compare(Compito c1, Compito c2) {
		return (c1.getCosto() - c2.getCosto());
	}
	
}
