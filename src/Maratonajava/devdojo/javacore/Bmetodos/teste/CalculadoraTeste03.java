package Maratonajava.devdojo.javacore.Bmetodos.teste;

import Maratonajava.devdojo.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {5,5};
        calculadora.somaAr(numeros);

        calculadora.somaVarArgs(1,2); // Principal diferença é apenas sintax.

    }
}
