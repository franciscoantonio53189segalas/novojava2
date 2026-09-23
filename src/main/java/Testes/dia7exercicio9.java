package Testes;

import java.util.Scanner;

public class dia7exercicio9 {
   public static void main() {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Digite um ano: ");
               int ano = scanner.nextInt();

               boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

               System.out.println(ehBissexto);

               scanner.close();
           }
       }

