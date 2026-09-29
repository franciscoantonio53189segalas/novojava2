package Testes;

import java.util.Scanner;

public class dia8exercicio4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a idade do candidato: ");
                int idade = scanner.nextInt();

                System.out.print("Digite o peso do candidato (em kg): ");
                double peso = scanner.nextDouble();

                if (idade >= 16 && idade <= 69 && peso >= 50.0) {
                    System.out.println("\n[RESULTADO]: O candidato ATENDE aos critérios de idade e peso.");

                    if (idade < 18) {
                        System.out.println("Atenção: Menores de 18 anos precisam de autorização formal dos responsáveis para doar.");
                    }
                } else {
                    System.out.println("\n[RESULTADO]: O candidato NÃO PODE doar sangue.");
                    System.out.println("Motivo(s):");
                    if (idade < 16 || idade > 69) {
                        System.out.println("- A idade deve estar entre 16 e 69 anos.");
                    }
                    if (peso < 50.0) {
                        System.out.println("- O peso mínimo exigido é de 50 kg.");
                    }
                }

                scanner.close();
            }
        }
