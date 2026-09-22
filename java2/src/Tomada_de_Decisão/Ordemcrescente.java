package Tomada_de_Decisão;

import java.util.Scanner;

public class Ordemcrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();

		if (a < b && a < c) {
			if (b < c) {
				System.out.println(a + ", " + b + ", " + c);
			} else {
				System.out.println(a + ", " + c + ", " + b);
			}
		} else if (b < a && b < c) {
			if (a < c) {
				System.out.println(b + ", " + a + ", " + c);
			} else {
				System.out.println(b + ", " + c + ", " + a);
			}
		} else {
			if (a < b) {
				System.out.println(c + ", " + a + ", " + b);
			} else {
				System.out.println(c + ", " + b + ", " + a);
			}
		}
	}
}
