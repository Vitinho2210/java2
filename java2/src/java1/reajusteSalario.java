package java1;

import java.util.Scanner;

public class reajusteSalario {
	public static void main (String [] agrs) {
		Scanner ler = new Scanner (System.in);
		double salario, reajuste;
		
		System.out.println("Qual o seu salário atual? Digite Aqui:");
		salario = ler.nextDouble();
		reajuste = salario * 1.10;
		System.out.println("Seu salário com reajuste aplicado,agora é de:" +reajuste);
	}
}
