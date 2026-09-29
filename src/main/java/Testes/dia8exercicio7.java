package Testes;

import java.util.Scanner;

public class dia8exercicio7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o comprimento do lado A: ");
                double ladoA = scanner.nextDouble();

                System.out.print("Digite o comprimento do lado B: ");
                double ladoB = scanner.nextDouble();

                System.out.print("Digite o comprimento do lado C: ");
                double ladoC = scanner.nextDouble();

                if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {
                    System.out.println("\nOs lados informados FORMAM um triângulo!");
                } else {
                    System.out.println("\nOs lados informados NÃO FORMAM um triângulo.");
                    System.out.println("Motivo: Um dos lados é maior ou igual à soma dos outros dois.");
                }

                scanner.close();
            }
        }
