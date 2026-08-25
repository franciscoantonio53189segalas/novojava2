package Testes;

import java.util.Scanner;

public class numerosDivisao {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("por quanto quer dividir: ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        double divisao = numero1 / numero2;

        System.out.printf("A divisao do numero ficou: %.4f%n ", divisao);
        scanner.close();
    }
}
