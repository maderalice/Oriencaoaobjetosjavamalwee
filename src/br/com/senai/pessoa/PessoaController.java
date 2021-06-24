package br.com.senai.pessoa;

import java.util.List;

import java.util.Scanner;

import br.com.senai.produto.Produto;

public class PessoaController {

	private Scanner tec;

	public PessoaController() {
		tec = new Scanner(System.in);

	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menuPessoa() {
		System.out.println("\n----MENU----");
		System.out.println("1) CADASTRAR PESSOA");
		System.out.println("2) LISTAR PESSOAS CADASTRADAS");
		System.out.println("3) EDITAR PESSOAS CADASTRADAS");
		System.out.println("4) EXCLUIR PESSOAS CADASTRADAS");
		System.out.println("5) SAIR DO SISTEMA");
		System.out.println("-----------------------");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		System.out.println("---CADASTRAR PESSOA---");

		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine().toUpperCase());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.println("Informe a sua altura: ");
		pessoa.setAltura(tec.nextDouble());

		System.out.println("Informe o nome do pais: ");
		tec.nextLine();
		pessoa.setNomePais(tec.nextLine().toUpperCase());

		System.out.print("Informe a sigla do país: ");
		pessoa.setSiglaPais(tec.nextLine().toUpperCase());

		System.out.print("Informe o estado: ");
		pessoa.setNomeEstado(tec.nextLine().toUpperCase());
		
		System.out.print("Informe a sigla do estado: ");
		pessoa.setSiglaEstado(tec.nextLine().toUpperCase());

		System.out.print("Informe a cidade: ");
		pessoa.setNomeCidade(tec.nextLine().toUpperCase());

		System.out.print("Informe o nome do bairro: ");
		pessoa.setBairro(tec.nextLine());

		System.out.print("Informe o nome da rua: ");
		pessoa.setRua(tec.nextLine().toUpperCase());

		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.nextLine().toUpperCase());

		System.out.print("Informe o número: ");

		pessoa.setNumeroDaCasa(tec.nextInt());

		return pessoa;

	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("------------------PESSOAS CADASTRADAS-----------------");

		System.out.printf("| %2s | %15s | %6s | %5s | %5s | %12s | %20s | %16s | %12s | %35s | %16s | %6s |\n", "Id", "Nome", "Ano",
				"Idade", "Altura", "País", "Estado", "Cidade", "Bairro", "Rua", "Complemento", "Número");

		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf(
					"| %2d | %15s | %4d | %5d | %6.2f | %5s - %3s | %5s - %3s | %16s | %12s | %35s | %16s | %6d | \n",
					i + 1,
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
	public List<Pessoa> editarPessoas(List<Pessoa> pessoas) {
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		}


		System.out.println("Informe o Id do pessoa para editar: ");
		int idPessoa = tec.nextInt() - 1;

		System.out.println("1) Informe o nome da pessoa");
		System.out.println("2) Ano de nascimento");
		System.out.println("3) Informe a altura");
		System.out.println("4) Informe o país");
		System.out.println("5) Informe a sigla do país");
		System.out.println("6) Informe o nome do estado");
		System.out.println("7) Informe a sigla do estado");
		System.out.println("8) Informe o nome da cidade");
		System.out.println("9) Informe o bairro");
		System.out.println("10) Informe a rua");
		System.out.println("11) Informe o complemento");
		System.out.println("12) Informe o número da casa");
		System.out.println("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DA PESSOA ---");
			System.out.println("Informe o novo nome da pessoa: ");
			pessoa.setNome(tec.next());

			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());

			pessoas.set(idPessoa, pessoa);
			
			break;

		case 2:
			System.out.println("--- EDITAR ANO DE NASCIMENTO ---");
			System.out.println("Informe o novo ano: ");
			pessoa.setAnoDeNascimento(tec.nextInt());

			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());

			pessoas.set(idPessoa, pessoa);
			
			break;

		case 3:
			System.out.println("--- EDITAR A ALTURA ---");
			System.out.println("Informe a nova altura: ");
			pessoa.setAltura(tec.nextDouble());

			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());

			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 4: 
			System.out.println("--- EDITAR O PAÍS ---");
			System.out.println("Informe o novo país: ");
			pessoa.setNomePais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 5:
			System.out.println("--- EDITAR A SIGLA DO PAÍS ---");
			System.out.println("Informe uma nova sigla: ");
			pessoa.setSiglaPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 6:
			System.out.println("--- EDITAR O ESTADO --- ");
			System.out.println("Informe o novo nome do estado: ");
			pessoa.setNomeEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 7:
			System.out.println("--- EDITAR SIGLA DO ESTADO ---");
			System.out.println("Informe uma nova sigla: ");
			pessoa.setSiglaEstado(tec.nextLine());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 8:
			System.out.println("--- EDITAR NOME DA CIDADE ---");
			System.out.println("Informe o novo nome da cidade: ");
			pessoa.setNomeCidade(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 9:
			System.out.println("--- EDITAR BAIRRO ---");
			System.out.println("Informe o novo bairro: ");
			pessoa.setBairro(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 10:
			System.out.println("--- EDITAR NOME DA RUA ---");
			System.out.println("Informe o nome da rua: ");
			pessoa.setRua(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 11:
			System.out.println("--- EDITAR COMPLEMENTO ---");
			System.out.println("Informe o novo complemento: ");
			pessoa.setComplemento(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 12:
			System.out.println("--- EDITAR NÚMERO DA CASA ---");
			System.out.println("Informe o novo número da casa: ");
			pessoa.setNumeroDaCasa(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomePais(pessoas.get(idPessoa).getNomePais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeEstado(pessoas.get(idPessoa).getNomeEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeCidade(pessoas.get(idPessoa).getNomeCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setRua(pessoas.get(idPessoa).getRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			break;

		default:
		}
		return pessoas;
	}
}