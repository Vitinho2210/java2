package java1;

import java.util.Scanner;

public class conversaoEuro {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double euro, cot, real;

		System.out.println("Digite o valor em Euro:");
		euro = ler.nextDouble();

		System.out.println("Digite a cotação do Euro:");
		cot = ler.nextDouble();

		real = euro * cot;
		System.out.println("O valor convertido em Reais é: " + real);
		
		ler.close();
	}

}