package Maratonajava.devdojo.introducao.Operadores;

public class Operadores {
    public static void main(String[] args) {
        /*Operadores Aritimeticos.
         + Soma
         - Subtração
         / Divisão
         * Multiplicação
         */

        int num = 10;
        int num1 = 5;
        int result = num + num1;
        System.out.println("Soma: " + result);

        /* Operadores Relacionais
        % Resto
         */
        int resto = 21 % 7;
        System.out.println(resto);

        // < Menor
        // > Maior
        // <= Maior Igual
        // >= Menor Igual
        // == Comparação
        // != Diferente

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte" + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte" + isDezIgualVinte);
        System.out.println("isDezIgualDez" + isDezIgualDez);
        System.out.println("isDezDiferenteDez" + isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        // && - Todas condicoes verdadeiras
        // || - Apenas uma condição precisa ser verdadeira.

        int age = 33;
        double salary = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary > 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 250;
        double contapouponca = 10000;
        double valorPS5 = 5000;
        boolean comprarPS5 = contaCorrente > valorPS5 || contapouponca > valorPS5;
        System.out.println(comprarPS5);

        // Atribuição
        // += -= *= /= %=

        double bonus = 1800;
        // bonus = bonus + 1000;
        bonus += 1000;
        System.out.println(bonus);

        int contador = 1;
        contador++; // 2
        contador--; // 1
        System.out.println(contador);

    }
}
