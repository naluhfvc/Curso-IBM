import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeraArquivo {

	public static void main(String[] args) throws IOException {
		ArrayList<String> nomeClientes = new ArrayList<String>(); // cria ArrayList
		nomeClientes.add("Petrolina"); // Insercao de registros
		nomeClientes.add("Roberto");
		nomeClientes.add("Livia");
		nomeClientes.add("Paulo");
		
		// Gera arquivo no caminho definido
		FileWriter arquivo = new FileWriter("C:\\Users\\analu\\OneDrive\\Documentos\\clientes.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		for(String contador : nomeClientes) {
			gravarArquivo.println(contador);
		}
		
		arquivo.close();

	}

}
