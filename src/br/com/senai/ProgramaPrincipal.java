package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.loja.Venda;
import br.com.senai.menu.Menu;
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

		boolean sair = false;
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		Menu menu = new Menu();

		do {
			menu.listarMenu();

			int opcao = menu.leOpcao();
			switch (opcao) {
			case 1:
				pessoaController.menu(pessoas);
				break;
			case 2:
				produtoController.menu(produtos);
				break;
			case 3:
				vendaController.menu(vendas, produtos, pessoas);
				break;

			case 4:
				sair = true;
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (!sair);

		System.out.println("Sistema finalizado!");
	}
	
	}

