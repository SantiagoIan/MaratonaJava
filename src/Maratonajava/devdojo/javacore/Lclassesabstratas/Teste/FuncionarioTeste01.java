package Maratonajava.devdojo.javacore.Lclassesabstratas.Teste;

import Maratonajava.devdojo.javacore.Lclassesabstratas.Dominio.Desenvolvedor;
import Maratonajava.devdojo.javacore.Lclassesabstratas.Dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Sergio", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Santiago", 15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

    }
}
