package Testes;

import java.util.Scanner;

public class dia7 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");

        int numero = Integer.parseInt(scanner.nextLine());

         boolean dentroDaFaixa = numero >= 10 && numero <= 20;

        System.out.println("Está entre os 10 e 20: " + dentroDaFaixa);

        scanner.close();






    }
}
