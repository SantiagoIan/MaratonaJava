package Maratonajava.devdojo.javacore.Bmetodos.dominio;

public class Calculadora {
    public void somadoisnumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiadoisnumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public double divdoisnum(double num1, double num2) {
        return num1 / num2;
    }

    public void somaAr(int[] numeros) {
        int soma = 0;
        for (int all : numeros) {
            soma += all;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int all : numeros) {
            soma += all;
        }
        System.out.println(soma);
    }
}
