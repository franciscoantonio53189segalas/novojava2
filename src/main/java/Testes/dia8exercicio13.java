package Testes;

import java.util.Scanner;

public class dia8exercicio13 {
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor total da compra (R$): ");
                String valorTexto = scanner.nextLine();

                if (!valorTexto.matches("\\d+(\\.\\d+)?")) {
                    System.out.println("Erro: Por favor, digite um valor numérico válido (use ponto para decimais).");
                    scanner.close();
                    return;
                }

                double valorCompra = Double.parseDouble(valorTexto);

                System.out.print("Digite a forma de pagamento (dinheiro ou cartao): ");
                String formaPagamento = scanner.nextLine().trim().toLowerCase();


                if (formaPagamento.equals("dinheiro")) {
                    double desconto = valorCompra * 0.05;
                    double valorFinal = valorCompra - desconto;

                    System.out.printf("💸 Desconto de 5%% aplicado! (Economia de R$ %.2f)%n", desconto);
                    System.out.printf("Total a pagar no dinheiro: R$ %.2f%n", valorFinal);
                } else if (formaPagamento.equals("cartao") || formaPagamento.equals("cartão")) {
                    System.out.printf("💳 Pagamento no cartão. Sem descontos aplicados.%n");
                    System.out.printf("Total a pagar: R$ %.2f%n", valorCompra);
                } else {
                    System.out.println("❌ Erro: Forma de pagamento inválida. Use apenas 'dinheiro' ou 'cartão'.");
                }

                scanner.close();
            }
        }


