package java1;

import java.util.Scanner;

public class salarioLiquido {
	public static void main (String []agr) {
		Scanner ler = new Scanner (System.in);
		double salarioBruto, salarioLiquido, inss, desconto, valorHora;
		int aulas;
		
		System.out.println("Digite o valor da hora-aula:");
		valorHora = ler.nextDouble();
		System.out.println("Digite o número de aulas que você tem no mês:");
		aulas = ler.nextInt();
		System.out.println("Digite o percentual de desconto do INSS:");
		inss = ler.nextDouble();
		
		//salário Bruto nesse exercício não é obrigatório,mas coloquei para organizar melhor o código
		
		salarioBruto = valorHora * aulas;
		desconto = salarioBruto * inss/100;
		salarioLiquido = salarioBruto - desconto;
		
		System.out.println("Seu salário bruto é de: R$" +salarioBruto);
		System.out.println("O desconto do INSS é de : R$" +desconto);
		System.out.println("Seu salário líquido é de : R$" +salarioLiquido);
	}
}