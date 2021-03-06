package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.loja.Venda;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {

	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;

	public VendaController() {
		tec = new Scanner(System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();

}

	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
}

	public List<Venda> listarVenda(List<Venda> vendas) {

		System.out.println("----------------VENDAS REALIZADAS----------------");

		System.out.printf("| %12s | %10s | %10s | %6s |\n ", "Cliente", "Produto", "Quantidade", "Valor");
		for(int i = 0; i < vendas.size(); i++) {
			System.out.printf("| %12s | %10s | %10d | %6.2f |\n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoProduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor());

}

		return vendas;

}

	public Venda cadastrarVenda(List<Produto> produtos, List<Pessoa> pessoas) {


		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("Impossível realizar vendas sem PRODUTOS ou PESSOAS  cadastradas!");
			return null;
}

		produtoController.listarProdutos(produtos);
		pessoaController.listarPessoas(pessoas);

		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();

		System.out.print("Informe o ID da pessoa: ");
		int idPessoa = tec.nextInt() - 1;


		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());

		venda.setPessoa(pessoa);

		System.out.print("Informe o ID do produto: ");
		int idProduto = tec.nextInt() - 1;

		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());

		venda.setProduto(produto);

		System.out.print("Informe a quantidade desejada: ");
		venda.setQuantidade(tec.nextInt());

		venda.setValor(produto.getValorUnitarioDoProduto() * venda.getQuantidade());


		return venda;
	}
	
	public void menu(List<Venda>vendas, List<Produto>produtos, List<Pessoa>pessoas){
		boolean sair = false;
		
		do {
			
		System.out.println("\n--- MENU ---");
		System.out.println("1) Criar");
		System.out.println("2) Listar");
		System.out.println("3) Sair do sistema");
		
		int opcao = leOpcao();
		switch(opcao) {
		case 1: 
			vendas.add(cadastrarVenda(produtos, pessoas));
			break;
			
		case 2: 
			listarVenda(vendas);
			break;

		case 4:
			sair = true;
			break;

		default:
			System.out.println("Opçăo inválida!");
			break;
		}
		
		}while(!sair);
	}
}

