import java.util.HashMap;

public class CamposRegistros {

	public static void main(String[] args) {

		//No hashmap cria 2 campos em um registro
		HashMap<String,String> nomeEmail = new HashMap<String,String>();
		
		nomeEmail.put("Ana","analufavacho@gmail.com" );
		nomeEmail.put("Alex", "teste@123.com");
		System.out.println(nomeEmail);
		
		System.out.println(nomeEmail.get("Ana"));
	}

}
