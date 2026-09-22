package java1;

import java.util.Scanner;
public class larguraParede {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double area, largura, comprimento;
		
		System.out.println("Digite a largura da sala (M)");
		largura = ler.nextDouble();
		System.out.println("Digite o comprimento da sala(M)");
		comprimento = ler.nextDouble();
		
		area = largura * comprimento;
		System.out.println("A área da sala é de:"+area+ "metros");
	}
}