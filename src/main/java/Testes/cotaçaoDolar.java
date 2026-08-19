package Testes;

import java.util.Scanner;

public class cotaçaoDolar { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite quantos reais você tem: ");
    double reais = Double.parseDouble(scanner.nextLine());

    System.out.println("Cotaçao do dolar hoje");
double cotacao = Double.parseDouble(scanner.nextLine());

double dolar = reais / cotacao;
    System.out.printf("Com R$ %.2f você consegue comprar US$ %.2f%n", reais, dolar);



}
}
