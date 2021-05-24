package br.com.senai;

public class ProgramaPrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();

		System.out.println("--- CARRO 1 ---");
		carro1.setMarca("Jeep");
		carro1.setModelo("Renegate");
		carro1.setAno(2010);
		carro1.setQtdPortas(4);
		System.out.println("----------------");
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQtdPortas());
		
		System.out.println("--- CARRO 2 ---");
		carro2.setMarca("Fiat");
		carro2.setModelo("Argo");
		carro2.setAno(2015);
		carro2.setQtdPortas(4);
		System.out.println("----------------");
		
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQtdPortas());
		
		System.out.println("--- CARRO 3 ---");
		carro3.setMarca("Fiat");
		carro3.setModelo("Doblo");
		carro3.setAno(2005);
		carro3.setQtdPortas(2);
		System.out.println("----------------");
		
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQtdPortas());
		
		System.out.println("--- CARRO 4 ---");
		carro4.setMarca("Citroen");
		carro4.setModelo("C3");
		carro4.setAno(2012);
		carro4.setQtdPortas(4);
		System.out.println("----------------");
		
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getQtdPortas());
		
	}

}

