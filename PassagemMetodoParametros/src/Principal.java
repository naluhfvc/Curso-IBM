import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nome, email;
		int idade;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = scan.nextLine();
		System.out.print("Digite o seu E-mail: ");
		email = scan.nextLine();
		System.out.print("Entre com a sua idade : ");
		String texto = scan.next();
		idade = Integer.parseInt(texto);
		
		MandaMensagem executar = new MandaMensagem();
		executar.mensagem(nome, email, idade);
		
		scan.close();
	}

}
