package Testes;

import java.util.Scanner;

public class Dia6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario");

        double salario1 = Double.parseDouble(scanner.nextLine());

        salario1 *= 1.10;
        salario1 *= 1.10;


        System.out.printf("Apos dois aumentos de 10%%, o seu salario final é %.2f%n", salario1 );
        scanner.close();



    }

}