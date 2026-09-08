package Testes;

import javax.swing.*;
import java.util.Scanner;

public class exdia7 {
   public static void main() {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite seu nome: ");
       String nome = scanner.nextLine();

       System.out.println("Digite sua idade: ");
       int idade = Integer.parseInt(scanner.nextLine());

       System.out.println("Digite seu saldo: ");
       double saldo = Double.parseDouble(scanner.nextLine());

       boolean maiorDeIdade = idade >= 18;
       boolean temSaldo = saldo > 0;
       boolean aprovado = maiorDeIdade && temSaldo;
       boolean ehAdministrador = nome.equalsIgnoreCase("admin");


       System.out.println("Maior de idade: " + maiorDeIdade);

       System.out.println("Tem saldo: " + temSaldo);

       System.out.println("Aprovado: " + aprovado);

       System.out.println("É administrador: " + ehAdministrador);

       System.out.println("Não aprovado: " + !aprovado);

       scanner.close();

    }
}
