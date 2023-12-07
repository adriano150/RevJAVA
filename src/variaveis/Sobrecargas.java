package variaveis;

public class Sobrecargas {
	
	public int somar(int valor1, int valor2) {
		int total = valor1 + valor2;
		return total;
	}
	
	public double somar(double valor1, double valor2) {
		double total = valor1 + valor2;
		return total;
	}
	
	public void somar(int valor1, double valor2) {
		double total = 1.00;
				total = valor1 + valor2;
	}
	
	public void somar(double valor1) {
		final int ind = 3;
		double total = valor1 * ind;
	}
	
	public void somar(int valor1) {
		final int ind = 4;
		double total = valor1 * ind;
	}

}
