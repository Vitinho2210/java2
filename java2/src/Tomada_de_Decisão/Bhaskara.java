package Tomada_de_Decisão;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, delta, x, x1, x2;

		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();

		delta = (b * b) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Não existem raízes reais!");
		} else if (delta == 0) {
			x = -b / (2 * a);
			System.out.println("X = " + x);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);
		}
		ler.close();
	}
}