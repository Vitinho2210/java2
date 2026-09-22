package java1;

import java.util.Scanner;

public class festa {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int h, m, salg, doces;
		double bolo, bebida;

		System.out.println("Digite a quantidade de convidados do sexo masculino:");
		h = ler.nextInt();

		System.out.println("Digite a quantidade de convidados do sexo feminino:");
		m = ler.nextInt();

		salg = (h * 15) + (m * 10);
		System.out.println("A quantidade de salgados a ser comprada é: " + salg);
		
		doces = (h * 6) + (m * 8);
		System.out.println("A quantidade de doces a ser comprada é: " + doces);
		
		bolo = (double) (h + m) * 0.1;
		System.out.println("A quantidade de bolo a ser comprada é: " + bolo + " kg");
		
		bebida = (double) (h * 0.6) + (m * 0.5);
		System.out.println("A quantidade de bebidas a ser comprada é: " + bebida + " litros");
		
		ler.close();
	}
}
