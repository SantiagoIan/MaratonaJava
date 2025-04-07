package Maratonajava.devdojo.javacore.Oexception.exception.test;

import Maratonajava.devdojo.javacore.Oexception.exception.dominio.Funcionario;
import Maratonajava.devdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;
import Maratonajava.devdojo.javacore.Oexception.exception.dominio.Pessoa;
import java.io.FileNotFoundException;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) throws LoginInvalidoException, FileNotFoundException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
        pessoa.salvar();

        // Abaixo, o método salvar da classe Funcionario sobrescreve o método salvar da classe Pessoa.
        // Runtime/unchecked exception: não é necessário fazer tratamento
        // checked exception: é necessário fazer tratamento
    }
}
