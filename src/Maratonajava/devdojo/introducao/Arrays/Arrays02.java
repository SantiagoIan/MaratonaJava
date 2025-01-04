package Maratonajava.devdojo.introducao.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Tipos primitivos & Tipos Reference
        // byte, short, int, ling, float e double = 0
        // char = '\u0000'
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "Naruto"; // Valor dentro do arrays; Sempre comecando por 0,1,2,3...
        nomes[1] = "Sasuke";
        nomes[2] = "Sakura";

        for (int i = 0; i < nomes.length; i++) { // muda como o tamanho do arrays
            System.out.println(nomes[i]);

        }
    }
}
