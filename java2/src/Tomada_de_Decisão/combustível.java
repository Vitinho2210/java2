package Tomada_de_Decisão;

import java.util.Scanner;

public class combustível {
	public static void main (String [] agrs) {
		Scanner ler = new Scanner (System.in);
		double distancia , litros ,gastoMedio;
		
		System.out.println("Qual a distância percorrida (km)");
		distancia = ler.nextDouble();
		System.out.println("Quantos litros de combustível você gastou?");
		litros = ler.nextDouble();
		
		gastoMedio = distancia/litros;
		
		if (gastoMedio >=10) {
			System.out.println("Seu carro é conômico");
		} else {
			System.out.println("Seu carro não é econômico");
		}
	}
}
