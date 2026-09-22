package Laços_Repetição;

import java.util.*;

public class Faixa_Etária {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
		int id;
		double p1, p2, p3, p4, p5;

		while (i <= 10) {
			System.out.println("Digite a idade do " +i+ "° usuário");
			id = in.nextInt();
			System.out.println();
			System.out.println("Idade registrada!");
			System.out.println();
			if (id <= 15) {
				f1 = f1 + 1;
			} else if (id <= 30) {
				f2 = f2 + 1;
			} else if (id <= 45) {
				f3 = f3 + 1;
			} else if (id <= 60) {
				f4 = f4 + 1;
			} else {
				f5 = f5 + 1;
			}
			i++;
		}
		
		System.out.println();
		System.out.println("Resultado por Faixa Etária:");
		System.out.println();
		
		p1 = (f1*100)/10;
		p2 = (f2*100)/10;
		p3 = (f3*100)/10;
		p4 = (f4*100)/10;
		p5 = (f5*100)/10;
		
		System.out.println("Faixa 1: " + f1 + " pessoas (" + p1 + "%)");
		System.out.println("Faixa 2: " + f2 + " pessoas (" + p2 + "%)");
		System.out.println("Faixa 3: " + f3 + " pessoas (" + p3 + "%)");
		System.out.println("Faixa 4: " + f4 + " pessoas (" + p4 + "%)");
		System.out.println("Faixa 5: " + f5 + " pessoas (" + p5 + "%)");
	}
}