package Tomada_de_Decisão;

import java.util.Scanner;

public class Calulo_IRPF {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double sal, irpf;

        System.out.println("Digite o seu salário: ");
        sal = ler.nextDouble();

        if (sal <= 1434.59) {
            System.out.println("Sem desconto de IRPF!");
        } else if (sal <= 2150.00) {
            irpf = sal * 7.5 / 100 - 107.59;
            System.out.println("IRPF a descontar: R$ " + irpf);
        } else if (sal <= 2866.70) {
            irpf = sal * 15.0 / 100 - 268.84;
            System.out.println("IRPF a descontar: R$ " + irpf);
        } else if (sal <= 3582.00) {
            irpf = sal * 22.5 / 100 - 483.84;
            System.out.println("IRPF a descontar: R$ " + irpf);
        } else {
            irpf = sal * 27.5 / 100 - 662.94;
            System.out.println("IRPF a descontar: R$ " + irpf);
        }
    }

}
