package Testes;

import java.util.Scanner;

public class dia8exercicio11 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora atual (0 a 23): ");
        String entrada = scanner.nextLine();


        if (!entrada.matches("\\d+")) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
            scanner.close();
            return;
        }

        int hora = Integer.parseInt(entrada);


        if (hora < 0 || hora > 23) {
            System.out.println("Erro: A hora deve ser um valor entre 0 e 23.");
        } else if (hora >= 5 && hora < 12) {
            System.out.println("☀️ Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("🌤️ Boa tarde!");
        } else {
            System.out.println("🌙 Boa noite!");
        }

        scanner.close();
    }
    }

