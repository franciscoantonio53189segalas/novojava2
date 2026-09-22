package Testes;

import java.beans.DefaultPersistenceDelegate;
import java.util.Scanner;

public class EXERCIDIA07 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = Integer.parseInt(scanner.nextLine());


        System.out.println("Digite o slado:");
        double saldo = Double.parseDouble(scanner.nextLine());

        boolean aprovado = idade >= 18 && saldo > 1000;

        System.out.println("Aprovados: " + aprovado);

scanner.close();



    }
}
