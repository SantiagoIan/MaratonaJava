package Maratonajava.devdojo.javacore.Aintroducaoclasses.teste;

import Maratonajava.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;
import Maratonajava.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Professor professor = new Professor();

        professor.name = "Jiraya";
        professor.age = 52;
        professor.sex = 'M';

        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.sex);

        estudante.name = "Santiago";
        estudante.age = 19;
        estudante.sex = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
