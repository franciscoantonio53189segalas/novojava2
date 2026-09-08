package Testes;

import java.util.Scanner;

public class exerdia7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro texto:");
        String texto1 = scanner.nextLine();

        System.out.println("Digite o segundo texto:");
        String texto2 = scanner.nextLine();

        System.out.println("Comprando com equalS:" + texto1.equals(texto2));
        System.out.println("Comprando com ==:      " + (texto1 == texto2));

scanner.close();
    }
}
