package Maratonajava.devdojo.javacore.Bmetodos.teste;

import Maratonajava.devdojo.javacore.Bmetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setName("Love Quinn");
        pessoa.setAge(22);

        pessoa.imprime();
    }
}
