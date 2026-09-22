package java1;

import java.util.Scanner;

public class idadeNome {
		public static void main (String[] args) {
			Scanner ler = new Scanner (System.in);
			String nome;
			int idade;
			
			System.out.println("Qual o seu nome?Digite abaixo:");
			nome = ler.next();
			System.out.println("Quala sua idade atual?Digite abaixo:");
			idade = ler.nextInt();
			
			System.out.println(nome+ "sua idade é de" +idade+ "anos");
		}
	}