package Maratonajava.devdojo.javacore.Gassociacao.Teste;

import Maratonajava.devdojo.javacore.Gassociacao.Dominio.Escola;
import Maratonajava.devdojo.javacore.Gassociacao.Dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");

        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
