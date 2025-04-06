package Maratonajava.devdojo.javacore.Oexception.exception.test;

import Maratonajava.devdojo.javacore.Oexception.exception.dominio.Leitor1;
import Maratonajava.devdojo.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivo();
    }


    // eles fecham na ordem inversa da abertura
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e){

        }
    }

/*      // O try with resources é uma forma de garantir que os recursos sejam fechados automaticamente
        // Só podemos usar com classes que implementam a interface AutoCloseable
    public static void lerArquivo() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"));){

        } catch (IOException e){

        }
        // apenas com o try with resources, não precisamos do finally para fechar o recurso
    }*/

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
