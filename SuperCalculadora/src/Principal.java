import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numero1;
		double numero2;
		boolean continuar = true;
		String txt;
		int opcao;

		System.out.println("-----------------OPCOES---------------");
		System.out.println("1- Adicao");
		System.out.println("2- Subtracao");
		System.out.println("3- Multiplicacao");
		System.out.println("4-  Divisao");
		System.out.println("5- Para encerrar o programa");
		System.out.println("------------------------------------------\n");

		do {

			System.out.print("Digite numero da opcao desejada: ");
			txt = scan.nextLine();
			opcao = Integer.parseInt(txt);


			switch (opcao) {

			case 1:
				System.out.print("\nDigite o primeiro numero: ");
				txt = scan.nextLine();
				numero1 = Integer.parseInt(txt);
				System.out.print("Digite o segundo numero: ");
				txt = scan.nextLine();
				numero2 = Integer.parseInt(txt);
				Adicao somar = new Adicao();
				somar.soma(numero1, numero2);
				break;
				
			case 2:
				System.out.print("\nDigite o primeiro numero: ");
				txt = scan.nextLine();
				numero1 = Integer.parseInt(txt);
				System.out.print("Digite o segundo numero: ");
				txt = scan.nextLine();
				numero2 = Integer.parseInt(txt);
				Subtracao diminuir = new Subtracao();
				diminuir.subtracao(numero1, numero2);
				break;
				
			case 3:
				System.out.print("\nDigite o primeiro numero: ");
				txt = scan.nextLine();
				numero1 = Integer.parseInt(txt);
				System.out.print("Digite o segundo numero: ");
				txt = scan.nextLine();
				numero2 = Integer.parseInt(txt);
				Multiplicacao multiplicar = new Multiplicacao();
				multiplicar.multiplicacao(numero1, numero2);
				break;
				
			case 4:
				System.out.print("\nDigite o primeiro numero: ");
				txt = scan.nextLine();
				numero1 = Integer.parseInt(txt);
				System.out.print("Digite o segundo numero: ");
				txt = scan.nextLine();
				numero2 = Integer.parseInt(txt);
				Divisao dividir = new Divisao();
				dividir.divisao(numero1, numero2);
				break;
				
			case 5:
				System.out.println("\nEncerrando programa......");
				continuar = false;
				break;
				
			default:
				System.out.println("\nEncerrando programa......");
				continuar = false;
				break;
			}

		} while (continuar);

		scan.close();
	}

}
