package br.com.senai.menu;

import java.util.Scanner;

public class Menu {

	Scanner tec = new Scanner(System.in);
	
	public void listarMenu() {
		System.out.println("|-------- MENU --------|");
		System.out.println("|1) Processo pessoa    |");
		System.out.println("|2) Processo produto   |");
		System.out.println("|3) Processo Venda     |");
		System.out.println("|4) Sair do Sistema    |");
		System.out.println("|----------------------|");
	}
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
}
}

