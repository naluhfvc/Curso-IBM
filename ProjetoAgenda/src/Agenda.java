
public class Agenda {

	public static void main(String[] args) {
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			//permite chamar a opcao read do nosso crud
			//sintaxeBanco.listaContatos();
			
			//permite chamar a opcao insert do CRUD
			//sintaxeBanco.inserirContato("Ana Luiza Favacho");
			
		//	sintaxeBanco.alterarContato("Luiz Ricardo", 4);
			
			sintaxeBanco.deletarContato(2);
			
			System.out.println("Conexao com o banco de dados foi com exito.");
		}else {
			System.out.println("Nao foi possivel conectar ao banco de dados.");
		}
		
		
		
	}
}
