package java1;

import java.util.Scanner;

public class prestacao {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int tempo;
		double taxa, prestacao, valor;
		
		System.out.println("A quanto tempo sua prestação está atrasada?Digite no campo abaixo:");
		tempo = ler.nextInt();
		System.out.println("Digite o valor da sua prestação:");
		valor = ler.nextDouble();
		System.out.println("Digite a taxa de juros ao dia (%):");
		taxa = ler.nextDouble();
		
		prestacao = valor + (valor *( taxa /100) * tempo);
		System.out.println("Valor da prestação é de:R$" +prestacao);
	}
}