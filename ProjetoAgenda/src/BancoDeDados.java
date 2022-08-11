import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {

	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;

	// Passagem de Parametros para a conexão do nosso Banco de Dados
	public void conectar() {

		// criacao da variavel para se conectar ao DataBase
		String servidor = "jdbc:mysql://localhost/ibm";
		// Usuario do banco de dados
		String usuario = "root";
		// senha do usuario do banco de dados
		String senha = "mysql";
		// Vinculando driver de conexão
		String driver = "com.mysql.cj.jdbc.Driver";

		// Permite verificar o tratamento da exceção caso ok banco de dados falhar
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}

	public boolean estaConectado() {

		if (this.connection != null) {
			return true;
		} else {
			return false;
		}

	}

	// criando metodo para fazer a consulta de dados em SQL para trazer registros
	public void listaContatos() {
			try {
			//Tratando excecao do retorno select
			String query= "Select * from contatos";
			this.resultset=this.statement.executeQuery(query);
			this.statement=this.connection.createStatement();
			//laco de repeticao para retornar registros da tabela
			while(this.resultset.next()) {
				String meuID = resultset.getString("id");
				String meuNome = resultset.getString("contatos");
				
				System.out.println("id:" + meuID);
				System.out.println("nome:" + meuNome);
			}
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
			
	}
	
	//inserir registros
	public void inserirContato(String contatos) {
		try {
			//linha de execucao da sintaxe de insert em sql
			String query="insert into contatos (contatos) values (' "+contatos+" ' );";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e){
			System.out.println("Erro:" + e.getMessage());
		}
	}
	
	public void alterarContato(String contatos, int id) {
		try {
			//linha de execucao da sinxtaxe update em sql
			String query="update contatos set contatos='"+contatos+" 'where id="+id+";";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e){
			System.out.println("Erro:" + e.getMessage());
		}
	}
	
	public void deletarContato(int id) {
		try {
		   //linha de execucao da sintaxe delete em sql
			String query="delete from contatos where id="+id+";";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e){
			System.out.println("Erro:" + e.getMessage());
		}
	}
	

}
