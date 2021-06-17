package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		System.out.println("---CADASTRAR PRODUTO---");

		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next().toUpperCase());

		System.out.print("Informe o valor unitario do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.println("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());

		return produto;
	}

	public List<Produto> listarProdutos(List<Produto> produtos) {
		System.out.println("------------------PRODUTOS CADASTRADOS-----------------");

		System.out.printf("| %2s | %18s | %18s | %20s | %18s |\n", "Id", "Nome", "Valor unitário", "Quantidade",
				"Valor total");

		for (int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %18s | %18.2f | %20d | %18.2f | \n", i, produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(), produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		return produtos;
	}

	public List<Produto> editarProduto(List<Produto> produtos) {
		Produto produto = new Produto();

		listarProdutos(produtos);

		System.out.println("Informe o Id do produto para editar: ");
		int idProduto = tec.nextInt();

		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade de produto");
		System.out.println("3) Valor unitário do produto");
		System.out.println("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DO PRODUTO ---");
			System.out.println("Informe o novo nome do produto: ");
			produto.setNomeDoProduto(tec.next());

			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());

			produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());
			produtos.set(idProduto, produto);

			break;

		case 2:
			System.out.println("--- EDITAR A QUANTIDADE DE PRODUTO ---");
			System.out.println("Informe a nova quantidade de produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());

			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());

			produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());
			produtos.set(idProduto, produto);

			break;

		case 3:
			System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
			System.out.println("Informe um novo valor unitário para o produto: ");
			produto.setValorUnitarioDoProduto(tec.nextFloat());

			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());

			
			produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());
			produtos.set(idProduto, produto);

			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

		return produtos;
	}
}