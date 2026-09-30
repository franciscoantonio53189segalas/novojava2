package Testes;

import java.util.Scanner;

public class dia8exercicio14 {
    static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a idade da primeira pessoa: ");
                String entrada1 = scanner.nextLine();
                if (!entrada1.matches("\\d+")) {
                    System.out.println("Erro: Por favor, digite uma idade válida (número inteiro).");
                    scanner.close();
                    return;
                }
                int idade1 = Integer.parseInt(entrada1);


                System.out.print("Digite a idade da segunda pessoa: ");
                String entrada2 = scanner.nextLine();
                if (!entrada2.matches("\\d+")) {
                    System.out.println("Erro: Por favor, digite uma idade válida (número inteiro).");
                    scanner.close();
                    return;
                }
                int idade2 = Integer.parseInt(entrada2);

                System.out.println("----------------------------------------");


                if (idade1 > idade2) {
                    System.out.println("A primeira pessoa é a mais velha (" + idade1 + " anos).");
                } else if (idade2 > idade1) {
                    System.out.println("A segunda pessoa é a mais velha (" + idade2 + " anos).");
                } else {
                    System.out.println("Empate! Ambas as pessoas têm a mesma idade (" + idade1 + " anos).");
                }

                scanner.close();
            }
        }

