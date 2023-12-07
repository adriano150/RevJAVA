package controle;

public class InterfaceLambda {

	public static void main(String[] args) {
		// Exemplo de empressão lambda
		Operacao soma = (a, b) -> a + b;

		// Utilizando a expressão lambda
		double resultado = soma.operar(3, 4);
		System.out.println("Resultado: " + resultado);

	}
}

// Interface funcional com um método abstrato
interface Operacao {
	double operar(double valor1, double valor2);

}
