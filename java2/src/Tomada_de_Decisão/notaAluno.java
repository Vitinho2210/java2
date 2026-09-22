package Tomada_de_Decisão;

import java.util.Scanner;

public class notaAluno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, m, m2;

		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();

		m = (n1 + n2) / 2;
		System.out.println("Sua média é: " + m);

		if (m < 3) {
			System.out.println("Reprovado!");
		} else if (m >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Você está em exame!");
			System.out.println("Digite a nota do exame: ");
			n3 = ler.nextDouble();
			m2 = (m + n3) / 2;
			System.out.println("Sua nova média é: " + m2);
			if (m2 >= 6) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}
		}
	}
}
