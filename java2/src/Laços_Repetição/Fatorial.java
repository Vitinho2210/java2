package Laços_Repetição;

import java.util.*;

public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int resultado = 1;
		int n;
		
		System.out.println("Digite o numero que deseja fatorar:");
		n = in.nextInt();
		
		while (n > 0 ) {
			resultado = resultado * n;
			n--;
		}
		System.out.println();
		System.out.println("O resultado é: " +resultado);
	}
}
