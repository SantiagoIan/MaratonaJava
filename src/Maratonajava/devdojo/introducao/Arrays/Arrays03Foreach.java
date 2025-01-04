package Maratonajava.devdojo.introducao.Arrays;

public class Arrays03Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        // Estou apenas criando 5 valores sem nada em memoria

        int[] numeros2 = {1, 2, 3, 4, 5};
        // Estou criando um array com 5 posições e atribuindo valores em memoria para cada posição.

        /* for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        } */


        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
