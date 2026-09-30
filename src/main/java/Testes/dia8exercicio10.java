package Testes;

import java.util.Scanner;

public class dia8exercicio10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("Digite o nome do produto (ou 'sair' para encerrar): ");
            String produto = scanner.nextLine();


            if (produto.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite a quantidade em estoque de '" + produto + "': ");
            String quantidadeTexto = scanner.nextLine();


            if (!quantidadeTexto.matches("\\d+")) {
                System.out.println("Erro: Por favor, digite um número inteiro válido para a quantidade.\n");
                continue;
            }

            int quantidade = Integer.parseInt(quantidadeTexto);


            if (quantidade < 10) {
                System.out.println("⚠️ AVISO: O estoque do produto '" + produto + "' está baixo! (Apenas " + quantidade + " unidades disponíveis).");
            } else {
                System.out.println("Estoque do produto '" + produto + "' está regular (" + quantidade + " unidades).");
            }

            System.out.println("----------------------------------------");

            scanner.close();


        }
    }
}













