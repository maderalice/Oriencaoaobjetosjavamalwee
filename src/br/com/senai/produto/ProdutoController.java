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
			produto.setNomeDoProduto(tec.nextLine());

			System.out.print("Informe o valor unitario do produto: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());

			System.out.println("Informe a quantidade do produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto()*produto.getValorUnitarioDoProduto());
	
			return produto;
	}
	
		public List<Produto> listarProdutos(List<Produto> produtos) {
			System.out.println("------------------PRODUTOS CADASTRADOS-----------------");
			
			System.out.printf("| %18s | %18s | %20s | %18s |\n", "Nome", "Valor unitário", "Quantidade", "Valor total");

			for (int i = 0; i < produtos.size(); i++) {
				System.out.printf("| %18s | %18.2f | %20d | %18.2f | \n",
						produtos.get(i).getNomeDoProduto(),
						produtos.get(i).getValorUnitarioDoProduto(), 
						produtos.get(i).getQuantidadeDoProduto(), 
						produtos.get(i).getValorTotalDoProduto());
		}
			return produtos;
	}
}