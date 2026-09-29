package Testes;

import java.util.Scanner;

public class dia8exercicio3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um ano: ");
                int ano = scanner.nextInt();


                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    System.out.println("O ano " + ano + " é BISSEXTO.");
                } else {
                    System.out.println("O ano " + ano + " NÃO É BISSEXTO.");
                }

                scanner.close();
            }
        }

