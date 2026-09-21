package Testes;

import java.util.Scanner;

public class dia7exercicio1 {
   public static void main(String[] args)
   { Scanner scanner = new Scanner(System.in);

       System.out.println("Digite sua idade");
       int idade = Integer.parseInt(scanner.nextLine());
       boolean idade1 = idade >= 18;
       System.out.println("É maior de idade? " + idade1);

    }
}
