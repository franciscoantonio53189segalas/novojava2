package Testes;

import java.util.Scanner;

public class dia7exercicio2 {
   public static void main() {
       Scanner scanner = new Scanner(System.in);



               System.out.print("Digite um nome: ");
               String nome = scanner.nextLine();

               if (nome.equalsIgnoreCase("admin")) {
                   System.out.println("O nome é igual a admin.");
               } else {
                   System.out.println("O nome não é igual a admin.");
               }

               scanner.close();
           }
       }




