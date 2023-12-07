package controle;

import variaveis.TesteEncapsulamento;

public class TesteUsuario {

	public static void main(String[] args) {
		TesteEncapsulamento teste = new TesteEncapsulamento();
		teste.addUsuario("Adriano", "Senha123");
		System.out.println("-------------");
		teste.listarUsuario();
		System.out.println("-------------");
	}

}
