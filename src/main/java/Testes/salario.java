package Testes;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu salario: ");
        double salario = Double.parseDouble(scanner. nextLine());
        double salarioComAumento = salario * 1.15;

        System.out.printf("O teu salario ficou: %.2f%n", salarioComAumento);
        scanner.close();



    }
}
