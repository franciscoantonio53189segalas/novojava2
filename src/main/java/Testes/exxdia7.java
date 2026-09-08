package Testes;

import java.util.Scanner;

public class exxdia7 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número:");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("São iguais: " + (a == b));
        System.out.println("O primeiro é maior: " + (a > b));

        scanner.close();
    }
}
