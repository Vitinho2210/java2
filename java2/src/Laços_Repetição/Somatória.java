package Laços_Repetição;


public class Somatória {
	public static void main(String[] args) {

		int i = 1;
		int somatoria = 0;

		while (i <= 100) {
			somatoria = somatoria + i;
			i++;
		}
		System.out.println("A somatória dos numeros inteiros é igual a: " + somatoria);

	}
}