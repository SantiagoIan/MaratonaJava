package Maratonajava.devdojo.javacore.Bmetodos.teste;

import Maratonajava.devdojo.javacore.Bmetodos.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.name = "Gabimaru";
        estudante.age = 20;
        estudante.sex = 'M';


        estudante02.name = "Noelle";
        estudante02.age = 20;
        estudante02.sex = 'F';

        estudante.imprime();
        estudante02.imprime();

    }
}
