package Testes;

import java.util.Scanner;

public class imc {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso:  ");
        double peso = Double.parseDouble(scanner. nextLine());

        System.out.print("Digite sua altura em metros: ");
        double altura = Double.parseDouble(scanner. nextLine());
        double imc = peso /Math.pow(altura, 2);
        System.out.printf(" Seu imc é: %.2f%n ", imc);


    }
}
