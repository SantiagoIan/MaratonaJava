package Maratonajava.devdojo.introducao.Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Santiago"); // Indice 0
        arrayDinamico.add("Sandra"); // Indice 1
        arrayDinamico.add("Sergio"); // Indice 2

        System.out.println("Dentro do for normal");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(i + " - " + arrayDinamico.get(i));
        }

        System.out.println();
        int i = 0;

        System.out.println("Dentro do foreach");
        for (String indice : arrayDinamico) {
            System.out.println(++i + " - " + indice);
        }


    }
}
