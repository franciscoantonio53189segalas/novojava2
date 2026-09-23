package Testes;

import java.util.Scanner;

public class dia7exercicio8 {
   public static void main() {
       Scanner scanner = new Scanner(System.in);

               System.out.print("Digite a nota do aluno: ");

               double nota = scanner.nextDouble();

               boolean resultado = (nota >= 0 && nota <= 10);

               System.out.println(resultado);

               scanner.close();
           }
       }










