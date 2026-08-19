package Testes;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class raioCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double nota1 = Double.parseDouble(scanner. nextLine());

        System.out.println("Digite a segunda nota");
        double nota2 = Double.parseDouble(scanner. nextLine());

        System.out.println("Digite a trceira nota");
        double nota3 = Double.parseDouble(scanner. nextLine());

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("a media final é: %.2f%n", media);
    }
}