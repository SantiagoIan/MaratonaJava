package Maratonajava.devdojo.javacore.Gassociacao.Exercicio.Teste;

import Maratonajava.devdojo.javacore.Gassociacao.Exercicio.Dominio.Aluno;
import Maratonajava.devdojo.javacore.Gassociacao.Exercicio.Dominio.Local;
import Maratonajava.devdojo.javacore.Gassociacao.Exercicio.Dominio.Professor;
import Maratonajava.devdojo.javacore.Gassociacao.Exercicio.Dominio.Seminario;

public class GerenciamentoTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Av. Paulista, 1090");
        Aluno aluno = new Aluno("Santiago", 19);
        Professor professor = new Professor("Dexter Morgan", "IA");
        Aluno[] alunosParticipantes = {aluno};

        Seminario seminario = new Seminario("Importancia da Inteligencia Artifial nos Dias Atuais", alunosParticipantes, local);
        Seminario[] seminariosDisponivels = {seminario};
        professor.setSeminarios(seminariosDisponivels);

        professor.imprime();

    }


}
