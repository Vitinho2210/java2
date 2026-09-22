package Tomada_de_Decisão;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int anoNasc, anoAtual, idade;

		System.out.println("Digite o ano de nascimento:");
		anoNasc = ler.nextInt();

		System.out.println("Digite o ano atual:");
		anoAtual = ler.nextInt();
		
		idade = anoAtual - anoNasc;
		System.out.println("Sua idade é: " + idade);

		if (idade < 18) {
			System.out.println("Você é menor de idade");

		} else {
			System.out.println("Você é maior de idade");
		}
		ler.close();
	}
}
