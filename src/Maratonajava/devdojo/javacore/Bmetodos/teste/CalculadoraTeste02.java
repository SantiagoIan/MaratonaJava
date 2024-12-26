package Maratonajava.devdojo.javacore.Bmetodos.teste;

import Maratonajava.devdojo.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        double result = cal.divdoisnum(20, 2);
        System.out.println(result);
    }
}
