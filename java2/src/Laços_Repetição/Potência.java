package Laços_Repetição;

import java.util.*;

public class Potência {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, resultado = 1;
		int base, expoente;

		System.out.println("Digite a base:");
		base = in.nextInt();
		System.out.println("Digite o expoente:");
		expoente = in.nextInt();

		while (i <= expoente) {
			resultado = resultado * base;
			i++;
		}
		System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
	}
}
