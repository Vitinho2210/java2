package Tomada_de_Decisão;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;

		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();

		if (a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("Você não possui um triangulo");
		} else if (a == b && b == c) {
			System.out.println("Triangulo equilatero");
		} else if (a != b && b != c && a != c) {
			System.out.println("Triangulo escaleno");
		} else {
			System.out.println("Triangulo isosceles");

		}

	}
}
