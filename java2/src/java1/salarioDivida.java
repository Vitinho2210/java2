package java1;

import java.util.Scanner;

public class salarioDivida {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		Double salario, limite;
		
		System.out.println("Insira o salário recebido: R$ ");
		salario = ler.nextDouble();
		
		limite = salario * 0.30;
		
		System.out.println("Valor máximo de dívidas é de :R$"+limite);
	}
}