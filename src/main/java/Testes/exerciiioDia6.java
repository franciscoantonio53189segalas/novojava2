package Testes;

import java.util.Scanner;

public class exerciiioDia6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o valor da compra: ");
        double compra = Double.parseDouble(scanner.nextLine());

        double frete = 9.90;
        System.out.printf("mais o valor do frete ficou: R$ %.2f%n ", compra + frete);










    }
}
