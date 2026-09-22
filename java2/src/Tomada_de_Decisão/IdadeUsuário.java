package Tomada_de_Decisão;

import java.util.Scanner;

public class IdadeUsuário {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int anoNasc, anoAtual, idade;

		System.out.println("Digite o ano de nascimento:");
		anoNasc = ler.nextInt();
		
		System.out.println("Digite o ano atual:");
		anoAtual = ler.nextInt();

		if (anoNasc >= 1900 && anoNasc <= 2026) {
			idade = anoAtual - anoNasc;
			System.out.println("Sua idade é:" +idade);

		} else {
			System.out.println("O ano digitado é inválido");
		}
		ler.close();
	}
}
