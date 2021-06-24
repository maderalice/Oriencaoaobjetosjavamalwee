package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.loja.Venda;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.pessoa.VendaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {
	
	private Scanner tec;
	
	public ProgramaPrincipal() {
		tec = new Scanner(System.in);

	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas  = new ArrayList<Venda>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		
		produtos.add(produto);

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();

		boolean sair = false;

		do {
			pessoaController.menuPessoa();

			int opcao = pessoaController.leOpcao();

			switch (opcao) {
			case 1:
				pessoas.add(pessoaController.cadastrarPessoa());
				break;

			case 2:
				pessoaController.listarPessoas(pessoas);
				break;

			case 3:
				produtos.add(produtoController.cadastrarProduto());
				break;

			case 4:
				produtoController.listarProdutos(produtos);
				break;
				
			case 5:
				produtoController.editarProduto(produtos);
				break;
				
			case 6:
				produtoController.excluirProduto(produtos);
				break;
				
			case 7:
				pessoaController.editarPessoas(pessoas);
				break;
				
			case 8:
				
			case 9:
				vendas.add(vendaController.cadastrarVenda(produtos, pessoas));
				break;
				
			case 10:
				vendaController.listarVenda(vendas);
				break;

			case 11:

				sair = true;
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (!sair);

		System.out.println("Sistema finalizado!");
	}
	
	public void menu() {
		System.out.println("\n----MENU----");
		System.out.println("1) PESSOA");
		System.out.println("2) PRODUTOS");
		System.out.println("3) VENDA");
		System.out.println("4) SAIR DO SISTEMA");
		System.out.println("-----------------------");
	}
}
