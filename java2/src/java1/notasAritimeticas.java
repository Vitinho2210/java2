package java1;

import java.util.Scanner;

public class notasAritimeticas {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double nota1, nota2, nota3, nota4,soma, media;
		
		System.out.println("Apresente a primeira nota:");
		nota1 = ler.nextDouble();
		System.out.println("Apresente a segunda nota:");
		nota2 = ler.nextDouble();
		System.out.println("Apresente a terceira nota:");
		nota3 = ler.nextDouble();
		System.out.println("Apresente a quarta nota:");
		nota4 = ler.nextDouble();
		
		soma = nota1+nota2+nota3+nota4;
		media = soma/4;
		System.out.println("A média aritmética das notas é de" +media);
	}
}