package Testes;

import java.util.Scanner;

public class dia7exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o primeiro número: ");
                int n1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int n2 = scanner.nextInt();

                System.out.print("Digite o terceiro número: ");
                int n3 = scanner.nextInt();

                boolean peloMenosUmNegativo = (n1 < 0) || (n2 < 0) || (n3 < 0);

                System.out.println("Pelo menos um é negativo? " + peloMenosUmNegativo);

                scanner.close();
            }
        }

