package Maratonajava.devdojo.javacore.Oexception.exception.dominio;

public class LoginInvalidoExeception extends Exception{
    public LoginInvalidoExeception() {
        super("Login ou senha inválidos");
    }

    public LoginInvalidoExeception(String message) {
        super(message);
    }
}
