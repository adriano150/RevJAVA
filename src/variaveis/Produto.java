package variaveis;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public String getNome() {
		return nome;
	}

	public double getNomeEPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	//-----------------

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNomeEPreco(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void setQuantidade(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//-----------------
	
	public void dadosProduto1(String nome) {
		setNome(nome);
	}
	
	public void dadosProduto2(String nome, double preco) {
		setNomeEPreco(nome, preco);
	}
	
	public void dadosProduto3(String nome, double preco, int quantidade) {
		setQuantidade(nome, preco, quantidade);
	}
	
	public String toString() {
		return "Produto: " + "\nNome: " + getNome() + "\nPreço: " + getNomeEPreco() + "\nQuantidade: " + getQuantidade();
	}
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("TV");
		produto.setNomeEPreco("TV", 900.00);
		produto.setQuantidade("TV", 900.00, 10);
		System.out.println(produto.toString());
	}

}
