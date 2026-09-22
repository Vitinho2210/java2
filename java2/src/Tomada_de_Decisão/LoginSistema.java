package Tomada_de_Decisão;

import java.util.Scanner;

public class LoginSistema {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String senha;
		
		System.out.println("Digite a senha:");
		senha = ler.next();
		
		if (senha.equalsIgnoreCase("senhasecreta")) {
			System.out.println("Acesso premitido!");
		} else {
			System.out.println("Você não possui acesso ao sistema!");
		}
		ler.close();
	}

}