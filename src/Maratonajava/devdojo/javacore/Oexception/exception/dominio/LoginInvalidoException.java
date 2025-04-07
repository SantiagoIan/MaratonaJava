package Maratonajava.devdojo.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login ou senha inválidos");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
