package Maratonajava.devdojo.javacore.Minterfaces.Teste;

import Maratonajava.devdojo.javacore.Minterfaces.Dominio.DataLoader;
import Maratonajava.devdojo.javacore.Minterfaces.Dominio.DatabaseLoader;
import Maratonajava.devdojo.javacore.Minterfaces.Dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        System.out.println();

        databaseLoader.remove();
        fileLoader.remove();

        System.out.println();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
