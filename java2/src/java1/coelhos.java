package java1;

	import java.util.Scanner;
	
public class coelhos {
	public static void main (String [] agrs) {
		Scanner ler = new Scanner (System.in);
		double custo;
		int numeroCoelhos;
		
		System.out.println("Qual a quantidade ded coelhos?Insira:");
		numeroCoelhos = ler.nextInt();
		
		custo = (numeroCoelhos * 0.70)/18 + 10;
		
		System.out.println("O custo com a criação de coelhos é de :R$" +custo);
	}
}