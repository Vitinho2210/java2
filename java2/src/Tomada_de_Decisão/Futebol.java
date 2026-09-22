package Tomada_de_Decisão;

import java.util.Scanner;

public class Futebol {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int timeA, timeB;
		
		System.out.println("Quantos gols o time A marcou?");
		timeA = ler.nextInt();
		
		System.out.println("Quantos gols o time B marcou?");
		timeB = ler.nextInt();
		
		if (timeA > timeB) {
			System.out.println("O time A ganhou o jogo");
		} else if (timeB > timeA) {
			System.out.println("O time B ganhou o jogo");
		} else {
			System.out.println("Empate");
		}
		ler.close();
	}
}
