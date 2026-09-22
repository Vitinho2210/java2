package Tomada_de_Decisão;

import java.util.Scanner;

public class Comparação_Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade1, idade2;

		System.out.println("Digite o nome do usuario 1: ");
		String nome1 = ler.next();
		System.out.println("Digite o nome do usuario 2: ");
		String nome2 = ler.next();
		System.out.println("Digite a idade do usuario 1: ");
		idade1 = ler.nextInt();
		System.out.println("Digite a idade do usuario 2: ");
		idade2 = ler.nextInt();

		if (idade1 > idade2) {
			System.out.println(nome1 + " é mais velho: " +idade1 + " anos");
			System.out.println(nome2 + " é mais novo: " +idade2 + " anos");
		} else if (idade2 > idade1) {
			System.out.println(nome2 + " é mais velho: " +idade2 + " anos");
			System.out.println(nome1 + " é mais novo: " +idade1 + " anos");
		} else {
			System.out.println("Os dois possuem a mesma idade");
			
		}

	}
}
