package Tomada_de_Decisão;

import java.util.Scanner;

public class idadeTomadaDecisão {
	public static void main (String [] agrs) {
		Scanner ler = new Scanner (System.in);
		int anoAtual, anoNascimento, idade;
		
		System.out.println("Qual o seu ano de nascimento?");
		anoNascimento = ler.nextInt();
		System.out.println("Qual o ano atual?");
		anoAtual = ler.nextInt();
		 
		idade = anoAtual - anoNascimento;
		System.out.println("Sua idade é de" +idade+ "anos");
		if (idade <10) {
			System.out.println("Aproveite,você é criança!!!");
		} else if (idade <18) {
			System.out.println("Estude,você é adolescente!!!");
		} else if (idade <60) {
			System.out.println("Trabalhe,você é adulto!!!");
		} else {
			System.out.println("Desfrute,você é idoso!!!");
		}
	}
}