package Laços_Repetição;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i = 3, tAnterior = 1, tAtual = 1;
		int n, tNovo;
		
		System.out.println("Quantos termos da sequência de Fibonacci você quer ver?");
		n = in.nextInt();
		System.out.println();
		System.out.println("Sequência de Fibonacci com " + n + " termos:");
		
		System.out.print(tAnterior + ", " + tAtual);
		
		while ( i <= n ) {
			tNovo = tAnterior + tAtual;
			System.out.print(", " + tNovo);
			tAnterior = tAtual;
			tAtual = tNovo;
			i++;
		}
		

	}
}