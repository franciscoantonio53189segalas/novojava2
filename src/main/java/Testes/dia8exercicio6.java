package Testes;

import java.util.Scanner;

public class dia8exercicio6 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor do salário (R$): ");
                double salario = scanner.nextDouble();

                double imposto = 0.0;
                String aliquota = "0%";

                if (salario <= 2000.00) {
                    imposto = 0.0;
                    aliquota = "Isento";
                } else if (salario <= 5000.00) {
                    imposto = salario * 0.10;
                    aliquota = "10%";
                } else {
                    imposto = salario * 0.20;
                    aliquota = "20%";
                }

                System.out.println("\n--- Resumo do Imposto ---");

                System.out.printf("Salário Bruto: R$ %.2f\n", salario);

                System.out.println("Alíquota aplicada: " + aliquota);

                System.out.printf("Valor do Imposto: R$ %.2f\n", imposto);

                System.out.printf("Salário Líquido: R$ %.2f\n", (salario - imposto));

                scanner.close();
            }
        }






