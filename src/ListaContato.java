import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaContato {
	
	private static List<Contato> lista = new ArrayList<Contato>();
	private static ComparaContato cc = new ComparaContato();
	static Scanner s = new Scanner(System.in);
	
	public void ShowMenu() {
		
			int opcao;
			s = new Scanner(System.in);
			
	        System.out.println("===================================");
	        System.out.println("Escolha uma opção: ");
	        System.out.println("-----------------------------------");
	        System.out.println("1 - Cadastrar novo contato \n2 - Listar Contatos \n3 - Sair");
	        System.out.println("-----------------------------------");

	        opcao = s.nextInt();
	        
	        switch (opcao) {
	            case 1:
	                inserirContato();
	                break;
	            case 2:
	            	Agenda();
	                break;
	            case 3:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Opção Inválida");
	                break;
		}
	}
	        
	    private static void inserirContato() {
	    	
	    	System.out.println("===================================");

	        System.out.println("Digite o nome");
	        String nome = s.next();
	        System.out.println("-----------------------------------");

	        System.out.println("Digite o numero");
	        String numero = s.next();
	        System.out.println("-----------------------------------");
	        Contato c = new Contato(nome, numero);
	        lista.add(c);
	    }
	    
	    private static void Agenda() {
	    	Collections.sort(lista, cc);
			System.out.println(lista);
	}
}