package Maratonajava.devdojo.javacore.Bmetodos.teste;

import Maratonajava.devdojo.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somadoisnumeros();
        calculadora.subtraiadoisnumeros(2, 5); // Colocando os valores dentro do metodo chamos isso de parametros
    }
}
