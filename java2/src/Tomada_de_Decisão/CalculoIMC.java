package Tomada_de_Decisão;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double p, h, imc;

		System.out.println("Digite o seu peso:");
		p = ler.nextDouble();
		System.out.println("Digite a sua altura:");
		h = ler.nextDouble();

		imc = p / (h * h);
		System.out.printf("Seu IMC é: %.2f ", imc);

		if (imc < 18.5) {
			System.out.println("Você esta com excesso de magreza!");
		} else if (imc < 25) {
			System.out.println("Você esta com o peso ideal!");
		} else if (imc < 30) {
			System.out.println("Você esta com excesso de peso!");
		} else if (imc < 35) {
			System.out.println("Você esta com obesidade grau 1!");
		} else if (imc < 40) {
			System.out.println("Você esta com obesidade grau 2!");
		} else {
			System.out.println("Você  esta com obesidade grau 3!");

		}

	}
}
