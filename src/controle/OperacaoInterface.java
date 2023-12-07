package controle;

public class OperacaoInterface {

	public double somar(double valor1, double valor2) {
		Operacao somar = (a, b) -> a + b;
		double resultado = somar.operar(valor1, valor2);
		return resultado;
	}

	public double subtrair(double valor1, double valor2) {
		Operacao subtrair = (a, b) -> a - b;
		double resultado = subtrair.operar(valor1, valor2);
		return resultado;
	}

	public double multiplicar(double valor1, double valor2) {
		Operacao multiplicar = (a, b) -> a * b;
		double resultado = multiplicar.operar(valor1, valor2);
		return resultado;
	}

	public double dividir(double valor1, double valor2) {
		Operacao dividir = (a, b) -> a / b;
		double resultado = dividir.operar(valor1, valor2);
		return resultado;
	}

}
