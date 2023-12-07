package controle;

import java.util.Scanner;

public class Start_OperacaoInterface {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		OperacaoInterface operacao = new OperacaoInterface();

		System.out.print("Informe o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Informe a operação que deseja realizar: \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Fatorial \n6 - Raiz");
		int escolha = entrada.nextInt();

		System.out.print("Informe o segundo valor: ");
		double valor2 = entrada.nextDouble();
		
		switch (escolha) {
		case 1:
			System.out.println(String.format("%.2f", operacao.somar(valor1, valor2)));
			break;
		case 2:
			System.out.println(String.format("%.2f", operacao.subtrair(valor1, valor2)));
			break;
		case 3:
			System.out.println(String.format("%.2f", operacao.multiplicar(valor1, valor2)));
			break;
		case 4:
			System.out.println(String.format("%.2f", operacao.dividir(valor1, valor2)));
			break;
		case 5:
		}

		entrada.close();
	}

}
