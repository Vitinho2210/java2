package Laços_Repetição;

import java.util.*;
public class Repetição_Idade {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i = 1;
		int anoNasc, anoAtual, idade;

		while (i < 7) {
			System.out.println("Digite o ano de nascimento do " + i + "° usuario");
			anoNasc = in.nextInt();

			System.out.println("Digite o ano atual:");
			anoAtual = in.nextInt();

			idade = anoAtual - anoNasc;
			System.out.println("A idade do " + i + "° usuario é: " + idade);

			if (idade < 18) {
				System.out.println("O " + i + "° usuario é menor de idade");

			} else {
				System.out.println("O " + i + "° usuario é maior de idade");
			}
			System.out.println();
			i++;
		}

	}
}
