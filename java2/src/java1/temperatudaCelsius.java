package java1;

import java.util.Scanner;

public class temperatudaCelsius {
	public static void main (String [] agrs) {
		Scanner ler = new Scanner (System.in);
		double celsius, fahrenheit;
		
		System.out.println("Qual a temperatura?Insira:");
		fahrenheit = ler.nextDouble();
		
		celsius = (fahrenheit - 32) * (5/9);
		System.out.println("A temperatura convertida para Celsius é de:"+celsius+"º");
	}
}