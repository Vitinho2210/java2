package Tomada_de_Decisão;

import java.util.Scanner;

public class par_ou_impar {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num, r;

		System.out.println("Digite um numero inteiro:");
		num = ler.nextInt();

		r = num % 2;

		if (r == 0) {
			System.out.println("O numero é Par");

		} else {
			System.out.println("O numero é Impar");
		}
		ler.close();
	}
}
