package variaveis;

import java.util.Scanner;

public class Start_Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Main main = new Main();
		System.out.print("Informe o valor: ");
		
		int valor01 = entrada.nextInt();
		
		main.checkNumber(valor01);
		System.out.print(main.toString());
		
		//----------
		
		SpeedConverter speed = new SpeedConverter(0, null);
		System.out.println("\nInforme um valor em KM: ");
		
		double valor02 = entrada.nextDouble();
		
		speed.toMilhasPorHora(valor02);
		speed.printConversion(valor02);
		System.out.println(speed.toString());
		
		
		entrada.close();
		
	}

}
