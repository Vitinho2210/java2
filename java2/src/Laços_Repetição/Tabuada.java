package Laços_Repetição;

import java.util.*;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		int n, t;

		System.out.println("Digite o numero inteiro: ");
		n = in.nextInt();

		while (i <= 10) {
			t = n * i;
			System.out.println(n + " x " + i + " = " + t);
			i++;
		}
	}

}