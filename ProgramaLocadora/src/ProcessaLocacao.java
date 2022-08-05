import java.util.*;
/*
cadastrar 10 carros:
opçoes:
1 - mostra todos os carros;
2- abra um pergunta para escolher o numero do carro
    e mostra o carro correspondente;
3 - permite fechar o programa;
 */
public class ProcessaLocacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] carros = { "Gol", "BWM", "HB20", "Palio", "Uno", "Honda City", "Sandero", "Camaro", "Fusion",
				"Prisma" };
		int opcao;
		boolean continuar = true;

		System.out.println("-----------------Escolha a opcao abaixo---------------");
		System.out.println("1 - Mostra todos os carros");
		System.out.println("2- Abra uma pergunta para escolher o numero do carro para mostrar o carro correspondente.");
		System.out.println("3 - Fecha o programa");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {

			System.out.print("Digite a opcao: ");
			opcao = scan.nextInt();
			System.out.println();

			switch (opcao) {

			case 1:
				System.out.println("Carros");
				for (int i = 0; i < carros.length; i++) {
					System.out.println((i + 1) + "- " + carros[i]);
				}
				System.out.println();
				break;

			case 2:
				System.out.print("Digite o numero do carro: ");
				int numeroCarro = scan.nextInt();
				System.out.println(carros[numeroCarro - 1]);
				System.out.println();
				break;

			case 3:
				System.out.println("Fim.");
				continuar = false;
				scan.close();
				break;

			default:
				System.out.println("Fim.");
				continuar = false;
				scan.close();
				break;
			}
		} while (continuar);
		

	}

}
