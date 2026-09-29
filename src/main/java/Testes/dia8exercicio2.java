package Testes;

import java.util.Scanner;

public class dia8exercicio2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10: ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Erro: A nota deve ser um valor entre 0 e 10.");
        } else {

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else if (nota >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }


        scanner.close();
    }
}












