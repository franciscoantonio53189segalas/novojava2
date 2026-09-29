package Testes;

import java.util.Scanner;

public class dia8exercicio8 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a temperatura atual (°C): ");
                double temperatura = scanner.nextDouble();

                if (temperatura < 15) {
                    System.out.println("Frio");
                } else if (temperatura <= 25) {
                    System.out.println("Ameno");
                } else {
                    System.out.println("Quente");
                }

                scanner.close();
            }
        }








