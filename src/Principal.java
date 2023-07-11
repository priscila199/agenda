import java.util.Scanner;

public class Principal {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

        int opcao;
        System.out.println("===================================");
        System.out.println("Escolha uma opção:");
        System.out.println("-----------------------------------");
        System.out.println("1 - Iniciar \n2 - Sair");
        System.out.println("-----------------------------------");

        opcao = s.nextInt();
        do {
            switch (opcao) {
                case 1:
                    ListaContato ListaContato = new ListaContato();
                    ListaContato.ShowMenu();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (opcao != 2);

	}
}
