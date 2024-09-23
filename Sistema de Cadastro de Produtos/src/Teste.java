import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Criando o produto

		System.out.println("Digite os dados do produto:");
		System.out.print("ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();

		// Instanciando o produto
		produto produto = new produto(id, nome, preco, quantidade);

		// Exibindo informações do produto
		System.out.println("Dados do produto: " + produto);

		// Adicionando produtos ao estoque

		System.out.print("Quantos produtos deseja adicionar ao estoque: ?");
		int qtdAdicionar = sc.nextInt();
		produto.adicionarProdutos(qtdAdicionar);
		System.out.println("Atualização de estoque: " + produto);

		// Removendo produtos do estoque

		System.out.print("Quantos produtos deseja remover do estoque: ?");
		int qtdRemover = sc.nextInt();
		produto.removerProdutos(qtdRemover);

		System.out.println("Atualização de estoque: " + produto);

		sc.close();

	}

}
