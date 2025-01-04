package Maratonajava.devdojo.javacore.Bmetodos.teste;

import Maratonajava.devdojo.javacore.Bmetodos.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudantee = new Estudante();

        estudante.name = "Lila";
        estudante.age = 19;
        estudante.sex = 'F';


        estudantee.name = "Jorel";
        estudantee.age = 21;
        estudantee.sex = 'M';

        estudante.imprime();
        estudantee.imprime();

    }
}
