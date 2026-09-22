package Tomada_de_Decisão;

import java.util.Scanner;

public class IdadeNadador {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.println("Digite a idade: ");
		idade = ler.nextInt();

		if (idade <= 8) {
			System.out.println("Você está na categoria Infantil");
		} else if (idade <= 13) {
			System.out.println("Você está na categoria Juvenil A");
		} else if (idade <= 17) {
			System.out.println("Você está na categoria Juvenil B");
		} else {
			System.out.println("Você está na categoria Adulto");
		}
	}
}
