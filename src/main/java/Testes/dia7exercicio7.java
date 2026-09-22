package Testes;

import java.util.Scanner;

public class dia7exercicio7 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();

                boolean naoEMaior = !(idade >= 18);

                System.out.println("A pessoa NÃO é maior de idade? " + naoEMaior);

                scanner.close();
            }
        }
