package Testes;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class divisao2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(scanner. nextLine());
        double divisao = numero / 2;
        System.out.printf("A divisao do numro ficou: %.2f%n ", divisao);
        scanner.close();


    }
}
