package Testes;

import java.util.Scanner;

public class exercicioDia06 {
    public static void main() {
Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double preco = Double.parseDouble(scanner. nextLine());

        preco *= 1.15;
        System.out.printf("Preço com aumento: R$ %.2f%n", preco);
        scanner.close();





    }
}
