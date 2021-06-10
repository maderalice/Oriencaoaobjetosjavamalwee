package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;

	public PessoaController() {
		tec = new Scanner(System.in);

	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("\n----MENU----");
		System.out.println("1) CADASTRAR PESSOA");
		System.out.println("2) LISTAR PESSOAS CADASTRADAS");
		System.out.println("9) SAIR DO SISTEMA");
		System.out.println("-----------------------");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		System.out.println("---CADASTRAR PESSOA---");

		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.println("Informe a sua altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.println("Informe o nome do pais: ");
		tec.nextLine();
		pessoa.setNomePais(tec.nextLine());
		
		System.out.print("Informe a sigla do país: ");
		pessoa.setSiglaPais(tec.nextLine());
		
		System.out.print("Informe o estado: ");
		pessoa.setNomeEstado(tec.nextLine());
		
		System.out.print("Informe a sigla do estado: ");
		pessoa.setSiglaEstado(tec.nextLine());
		
		System.out.print("Informe a cidade: ");
		pessoa.setNomeCidade(tec.nextLine());
		
		System.out.print("Informe o nome do bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Informe o nome da rua: ");
		pessoa.setRua(tec.nextLine());

		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.print("Informe o número: ");

		pessoa.setNumeroDaCasa(tec.nextInt());
		
		
		return pessoa;
		
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		System.out.println("------------------PESSOAS CADASTRADAS-----------------");

		System.out.printf("| %20s | %6s | %5s | %6s | %10s | %7s | %15s | %3s | %20s | %20s | %15s | %7s | %6s |\n", "Nome", "Ano", "Idade", "Altura", "País", 
				"Sigla do País", "Estado", "Sigla do Estado", "Cidade", "Bairro", "Rua", "Complemento", "Número");

		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %6d | %5d | %6.2f | %10s | %12s | %15s | %3s | %20s | %20s | %15s | %7s | %6d | \n", 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(), 
					pessoas.get(i).getIdade(), 
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomePais(),
					pessoas.get(i).getSiglaPais(),
					pessoas.get(i).getNomeEstado(),
					pessoas.get(i).getSiglaEstado(),
					pessoas.get(i).getNomeCidade(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getRua(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumeroDaCasa());
		}

		return pessoas;
	}
	
}