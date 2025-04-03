package Maratonajava.devdojo.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    public static void main(String[] args) throws IOException{
        criarArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace(); // Fundamental colocar o StackTrace, se nao a Exception nao funciona.
            throw e; // throw e lança a exceção novamente.
        }
    }
}