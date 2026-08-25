package Testes;

import java.util.Scanner;

public class distanciaViagem {
     public static void main() {
         Scanner scanner = new Scanner(System.in);

         System.out.print("qual a distancia que andamos: ");
         double distancia = Double.parseDouble(scanner. nextLine());

         System.out.print("Digite o consumo do carro por km: " );
         double consumo = Double.parseDouble(scanner. nextLine());
         System.out.print("Preço por litro: ");
         double precoLitro = Double.parseDouble(scanner. nextLine());

         double litrosNecessarios = distancia / consumo;
         double custoTotal = litrosNecessarios * precoLitro;
         System.out.printf("o custo total do combustivel sera: %.2f%n ", custoTotal);


    }
}
