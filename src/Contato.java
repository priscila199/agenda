
public class Contato implements Comparable<Contato>{
	
	private String nome;
	private String numero;
	
	Contato(String nome, String numero){
		this.nome = nome;
		this.numero = numero;
	}
	
	public String toString() {
		return "Nome: " + this.nome + ", Número: " + this.numero;
	}
	
	@Override
	public int compareTo(Contato contato) {
		return this.nome.compareTo(contato.getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
