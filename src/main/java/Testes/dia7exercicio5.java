package Testes;

import java.util.Scanner;

public class dia7exercicio5 {
   public static void main() {
       Scanner scanner = new Scanner(System.in);

               System.out.print("Digite o primeiro número: ");
               int n1 = scanner.nextInt();

               System.out.print("Digite o segundo número: ");
               int n2 = scanner.nextInt();

               boolean ambosPositivos = (n1 > 0) && (n2 > 0);

               System.out.println("Os dois são positivos? " + ambosPositivos);

               scanner.close();
           }
       }


