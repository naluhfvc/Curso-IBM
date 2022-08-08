import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();

		System.out.println("OPCOES: ");
		System.out.println("1- Cadastrar Frutas");
		System.out.println("2- Listar Frutas");
		System.out.println("3- Excluir Frutas");
		System.out.println("4- Listar Frutas com ID");
		System.out.println("5- Modificar uma Fruta");
		System.out.println("6- Encerrar Programa");
		System.out.println("-----------------------------");

		boolean continuar = true;

		do {
			System.out.print("\nDigite o numero da opcao: ");
			String texto = scan.nextLine();
			int opcao = Integer.parseInt(texto);

			switch (opcao) {

			case 1:
				System.out.print("Digite a fruta: ");
				String fruta = scan.nextLine();
				frutas.add(fruta);
				break;

			case 2:
				System.out.println(frutas);
				break;

			case 3:
				System.out.print("Digite o ID da fruta que deseja remover: ");
				String text = scan.nextLine();
				int i = Integer.parseInt(text);
				frutas.remove(i-1);
				break;

			case 4:
				System.out.println("\nFRUTAS: ");
				for (int indice = 0; indice < frutas.size(); indice++) {
					System.out.println((indice + 1) + " -  " + frutas.get(indice));
				}
				break;

			case 5:
				System.out.print("\nDigite o id da fruta que deseja modificar: ");
				String txt = scan.nextLine();
				int id = Integer.parseInt(txt);
				System.out.println("Fruta atual: " + frutas.get(id-1));
				System.out.print("\nDigite a modificacao: ");
				String frutaNova = scan.nextLine();
				frutas.set(id-1, frutaNova);
				System.out.println("Fruta modificada: " + frutas.get(id-1));
				break;
				
			case 6:
				System.out.println("\nEncerrando Programa...");
				continuar = false;
				break;

			default:
				System.out.println("\nOpcao selecionada nao existe.");
				System.out.println("\nEncerrando programa...");
				continuar = false;
				break;
			}
		} while (continuar);

		scan.close();
	}
}