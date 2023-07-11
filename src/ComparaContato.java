import java.util.Comparator;

public class ComparaContato implements Comparator<Contato>{

	@Override
	public int compare(Contato c1, Contato c2) {
		return c1.getNome().compareTo(c2.getNome());
	}

}
