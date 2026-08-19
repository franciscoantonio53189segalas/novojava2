package Testes;

import java.util.Scanner;

public class comprasParceladas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite o valar total das compras:");
        double ValorTotal = Double.parseDouble(scanner. nextLine());

        System.out.println("Digite o valor das parcelas");
        int parcelas = Integer.parseInt(scanner.nextLine());

         double valorParcela = ValorTotal /parcelas;

        System.out.printf("Sua compra será paga em %d parcelas de R$ %.2f%n", parcelas, valorParcela);

    }
}