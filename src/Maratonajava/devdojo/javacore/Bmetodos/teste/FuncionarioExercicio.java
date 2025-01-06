package Maratonajava.devdojo.javacore.Bmetodos.teste;

import Maratonajava.devdojo.javacore.Bmetodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Love Quinn");
        funcionario.setIdade(22);
        funcionario.setSalario(new double[]{1144.50, 2239.95, 1420.00});
        funcionario.imprimeDados();


    }
}
