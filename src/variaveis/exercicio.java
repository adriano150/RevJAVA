package variaveis;

public class exercicio {

	public static void main(String[] args) {
		double valor01 = 20.00;
		double valor02 = 80.00;
		double totalValores = (valor01 + valor02) * 100;
		System.out.println("O total dos valores mult. 100 é: " + totalValores);
		double restante = totalValores % 40.00;
		System.out.printf("O restante é: " + restante);
		
		boolean naoResta = restante == 0 ? true : false;
		System.out.println("\nNão resta: " + naoResta);
		
		if(!naoResta) {
			System.out.println("Tenho algum resto");
		}

	}

}
