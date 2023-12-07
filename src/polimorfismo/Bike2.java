package polimorfismo;

public class Bike2 {
	
	// Definindo o mesmo método da classe pai
	void run() {
		System.out.println("A bicicleta está funcionando com segurança");
	}
	
	public static void main(String[] args) {
		Bike2 obj = new Bike2(); // Criando objeto
		obj.run(); // Chamando método
	}

}
