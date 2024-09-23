public class produto {

	private int id;
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor

	public produto(int id, String nome, double preco, int quantidade) {

		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// Método para calcular o valor total do estoque

	public double valorTotalEmEstoque() {
		return this.preco * this.quantidade;

	}

	// Método para adicionar produtos ao estoque

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	// Método para remover produtos do estoque

	public void removerProdutos(int quantidade) {
		if (this.quantidade >= quantidade) {
			this.quantidade -= quantidade;
		} else {
			System.out.println("Quantidade indisponível!");
		}

	}

	@Override
	public String toString() {
		return "Produto [ID: " + id + ", Nome: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade
				+ ", Valor Total: R$ " + valorTotalEmEstoque() + "]";
	}
}
