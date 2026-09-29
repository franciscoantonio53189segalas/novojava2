package Testes;

import java.util.Scanner;

public class dia8exercicio9 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 < num2) {
            System.out.println("O menor número é: " + num1);
        } else if (num2 < num1) {
            System.out.println("O menor número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

    }
}











