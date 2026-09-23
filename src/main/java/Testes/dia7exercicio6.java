package Testes;

import java.util.Scanner;

public class dia7exercicio6 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean loginValido = usuario.equals("admin") && senha.equals("1234");

        System.out.println("Acesso concedido? " + loginValido);

        scanner.close();
    }

}


