package Testes;

import java.util.Scanner;

public class retangulo {
    public static void main (String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo ");
        double base = Double.parseDouble(scanner. nextLine());

        System.out.println("Digite a altura do retnâgulo");
        double altura = Double.parseDouble(scanner. nextLine());

double area = base * altura;
        System.out.printf("A area é : %.2f%n", area);

    }
}
