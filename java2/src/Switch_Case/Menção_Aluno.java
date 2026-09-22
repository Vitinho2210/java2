package Switch_Case;

import java.util.Scanner;

public class Menção_Aluno {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String m;
		
		System.out.println("Digite a mencao do aluno (MB, B, R ou I):");
		m = in.next().toUpperCase();
		
		switch (m) {
			case "MB":
				System.out.println("Excelente desempenho");
				break;
			case "B":
				System.out.println("Bom desempenho");
				break;
			case "R":
				System.out.println("Desempenho regular");
				break;
			case "I":
				System.out.println("Desempenho insatisfatorio");
				break;
			default:
				System.out.println("Mencao invalida");
		}
		
	}
}
