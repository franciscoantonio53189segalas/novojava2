package Testes;

import java.util.Scanner;

public class dia8exercicio12 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um número inteiro: ");
                String entrada = scanner.nextLine();


                if (!entrada.matches("-?\\d+")) {
                    System.out.println("Erro: Por favor, digite um número inteiro válido.");
                    scanner.close();
                    return;
                }

                int numero = Integer.parseInt(entrada);


                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é PAR.");
                } else {
                    System.out.println("O número " + numero + " é ÍMPAR.");
                }

                scanner.close();
            }
        }

