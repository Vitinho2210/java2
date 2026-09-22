package Switch_Case;

import java.util.Scanner;

public class Escola_Futebol {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int id;
		System.out.println("Informe a idade");
		id = in.nextInt();
		
		switch(id) {
			case 6:
				System.out.println("categoria: Dente de leite");
				break;
			case 7:
				System.out.println("categoria: Junior");
				break;
			case 8:
				System.out.println("categoria: Junior Max");
				break;
			case 9:
				System.out.println("categoria: Junior Master");
				break;
			case 10:
				System.out.println("categoria: Master");
				break;
			default:
				System.out.println("năo temos vaga para essa idade");
		}
	}
}