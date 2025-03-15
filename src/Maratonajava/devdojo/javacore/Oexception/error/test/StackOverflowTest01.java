package Maratonajava.devdojo.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        revursivo();
    }

    public static void revursivo() {
        revursivo();
    }
}
