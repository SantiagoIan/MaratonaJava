package Maratonajava.devdojo.introducao.Arrays;

public class Arrays03Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        // Estou apenas criando 5 valores sem nada em memoria

        int[] numeros2 = {1, 2, 3, 4, 5};
        // Estou criando um array com 5 posições e atribuindo valores em memoria para cada posição.
        // position 0 = 1
        // position 1 = 2
        // position 2 = 3
        // position 3 = 4
        // position 4 = 5


        /* for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        } */


        for (int num : numeros) {
            System.out.print(num +" ");
        }
    }
}
