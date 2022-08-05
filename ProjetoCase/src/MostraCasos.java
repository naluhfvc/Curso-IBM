
public class MostraCasos {

	public static void main(String[] args) {
		
		int opcao = 2;
		String[] carros= {"Sandero", "Fusion", "Prisma"};
		
		System.out.println("Escolha a opcao abaixo");
		System.out.println("1- Mostrar carro da marca Honda.");
		System.out.println("2- Mostrar todos os carros.");
		
		switch(opcao) {
		case 1:
			System.out.println("Nao temos carros para alocar");
			break;
		case 2:
			for(int i = 0; i<carros.length; i++) {
				System.out.println(carros[i]);
			}
			break;
		}
	}

}
