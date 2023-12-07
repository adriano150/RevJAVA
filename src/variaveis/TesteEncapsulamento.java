package variaveis;

public class TesteEncapsulamento {
	// Teste caixa preta
	private String usuario;
	private String senha;
	
	private String getUsuario() {
		return usuario;
	}

	private String getSenha() {
		return senha;
	}

	protected void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	protected void setSenha(String senha) {
		this.senha = senha;
	}

	public void addUsuario(String usuario, String senha) {
		setUsuario(usuario);
		setSenha(senha);
	}

	public void listarUsuario() {
		System.out.println("Usuário: " + getUsuario());
		System.out.println("Senha: " + getSenha());
	}
	
	public void excluirUsuario() {
		
	}
	
	public static void main(String[] args) {
		TesteEncapsulamento teste = new TesteEncapsulamento();
		teste.addUsuario("Adriano", "Senha123");
		System.out.println("-------------");
		teste.listarUsuario();
		System.out.println("-------------");
	}
}
