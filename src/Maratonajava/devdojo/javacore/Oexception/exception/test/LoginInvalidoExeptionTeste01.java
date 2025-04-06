package Maratonajava.devdojo.javacore.Oexception.exception.test;

import Maratonajava.devdojo.javacore.Oexception.exception.dominio.LoginInvalidoExeception;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoExeception {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Santiago";
        String passwordDB = "1327";

        System.out.println("Digite o username:");
        String username = scanner.nextLine();
        System.out.println("Digite a senha:");
        String password = scanner.nextLine();

        if (!usernameDB.equals(username) || !passwordDB.equals(password)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
