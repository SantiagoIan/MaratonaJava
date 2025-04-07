package Maratonajava.devdojo.javacore.Oexception.exception.test;

import Maratonajava.devdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            System.out.println("Login inválido");
        }
    }

    protected static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Santiago";
        String passwordDB = "1327";

        System.out.println("Digite o username:");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Digite a senha:");
        String passwordDigitado = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}