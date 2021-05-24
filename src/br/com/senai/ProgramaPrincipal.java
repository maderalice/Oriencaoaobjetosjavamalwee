package br.com.senai;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		//Johnatan
		//Mayara
		//Lívia
		//Anthony
		
		System.out.println("--- PESSOA 1 ---");
		pessoa1.setNome("Alice");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("F");
		System.out.println("----------------");
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());
		
		System.out.println("--- PESSOA 2 ---");
		pessoa2.setNome("Julia");
		pessoa2.setAnoDeNascimento(2004);
		pessoa2.setSexo("F");
		System.out.println("----------------");
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getAnoDeNascimento());
		System.out.println(pessoa2.getSexo());
		
		System.out.println("--- PESSOA 3 ---");
		pessoa3.setNome("Gustavo");
		pessoa3.setAnoDeNascimento(2004);
		pessoa3.setSexo("M");
		System.out.println("----------------");
		
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getAnoDeNascimento());
		System.out.println(pessoa3.getSexo());
		
		System.out.println("--- PESSOA 4 ---");
		pessoa4.setNome("Alisson");
		pessoa4.setAnoDeNascimento(2003);
		pessoa4.setSexo("M");
		System.out.println("----------------");
		
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getAnoDeNascimento());
		System.out.println(pessoa4.getSexo());
		
	}

}
