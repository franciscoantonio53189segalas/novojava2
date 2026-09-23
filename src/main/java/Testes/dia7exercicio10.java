package Testes;

import java.util.Scanner;

public class dia7exercicio10 {
   public static void main() {
        Scanner scanner = new Scanner(System.in);


               System.out.print("Digite o primeiro texto: ");
               String texto1 = scanner.nextLine();

               System.out.print("Digite o segundo texto: ");
               String texto2 = scanner.nextLine();

               if (!texto1.equals(texto2)) {
                   System.out.println("Os textos são diferentes!");
               } else {
                   System.out.println("Os textos são iguais.");
               }

               scanner.close();
           }
       }
