import java.util.Scanner;

public class ProcessaTabuada {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = scan.nextInt();

		// criando laço de repetiçao
		for (int i = 1; i <= 10; i++) {
			System.out.println( valor + " x " + i + " = " + (valor * i) );
		}
	}

}
