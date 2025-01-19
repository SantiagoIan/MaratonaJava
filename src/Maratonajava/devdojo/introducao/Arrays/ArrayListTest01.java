package Maratonajava.devdojo.introducao.Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Santiago"); // Indice 0
        arrayDinamico.add("Sandra"); // Indice 1
        arrayDinamico.add("Sergio"); // Indice 2

        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(i + " - " + arrayDinamico.get(i));
        }

        System.out.println();
        for (String indice : arrayDinamico) {
            System.out.println(indice);
        }


    }
}
