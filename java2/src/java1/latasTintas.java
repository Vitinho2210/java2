package java1;

import java.util.Scanner;

public class latasTintas {
		public static void main (String [] agrs) {

			Scanner ler = new Scanner(System.in);
			double comp, larg, area;
			int num_latas;

			System.out.println("Digite o comprimento da parede:");
			comp = ler.nextDouble();

			System.out.println("Digite a largura da parede:");
			larg = ler.nextDouble();

			area = comp * larg;
			num_latas = (int) (area / 3.8);
			System.out.println("A quantidade de latas de tinta necessária é: " + num_latas);
			
			ler.close();

		}

	}
