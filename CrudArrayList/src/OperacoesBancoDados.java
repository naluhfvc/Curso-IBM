
import java.util.ArrayList;

public class OperacoesBancoDados {

	public static void main(String[] args) {

		ArrayList<String> nomeClientes = new ArrayList<String>(); // cria ArrayList
		nomeClientes.add("Petrolina"); // Insercao de registros
		nomeClientes.add("Roberto");
		nomeClientes.add("Livia");
		nomeClientes.add("Paulo");

		System.out.println(nomeClientes);// mostra todos os registro da ArrayList

		System.out.println(nomeClientes.get(1)); // mostra registro especificado;

		// Inserção de registros com ArrayList e Set
		ArrayList<String> marcas = new ArrayList<String>();
		marcas.add("Fiat");
		marcas.add("Chevrolet");
		marcas.add("Ford");
		marcas.add("BMW");
		System.out.println(marcas);
		marcas.set(0, "Volkswagen"); // para modificar o registro
		System.out.println(marcas);

		// removendo registros dentro da estrutura ArrayList
		marcas.remove(3);
		System.out.println(marcas);

		// retornando a quantidade de registros de um ArrayList
		System.out.println(marcas.size());
		
		//como utilizar size dentro do loop
		for (String i : marcas) {
			System.out.println(i); //exibe um por um
		}
		
	}

}
