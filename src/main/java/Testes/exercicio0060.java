package Testes;

import java.util.Scanner;

public class exercicio0060 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo numero:");
        int b = Integer.parseInt(scanner.nextLine());

        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();



    }
}
