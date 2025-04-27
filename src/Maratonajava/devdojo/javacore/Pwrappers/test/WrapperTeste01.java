package Maratonajava.devdojo.javacore.Pwrappers.test;

public class WrapperTeste01 {
    public static void main(String[] args) {
        // Wrappers
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 1;
        long longPrimitivo = 1L;
        float floatPrimitivo = 1.0f;
        double doublePrimitivo = 1.0;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 127; // Autoboxing
        Short shortWrapper = 1; // Autoboxing
        Integer intWrapper = 1; // Autoboxing
        Long longWrapper = 1L; // Autoboxing
        Float floatWrapper = 1.0f; // Autoboxing
        Double doubleWrapper = 1.0; // Autoboxing
        Character charWrapper = 'A'; // Autoboxing
        Boolean booleanWrapper = true; // Autoboxing

        int i = intWrapper; // Unboxing
        Integer intWrapper2 = Integer.parseInt("1"); // Autoboxing
        boolean verdadeiro = Boolean.parseBoolean("true"); // Autoboxing
        System.out.println(verdadeiro+"\n");

        System.out.println(Character.isDigit('A')); // Verifica se o caractere é um dígito
        System.out.println(Character.isDigit('1')); // Verifica se o caractere é um dígito
        System.out.println(Character.isLetter('A')); // Verifica se o caractere é uma letra
        System.out.println(Character.isLetterOrDigit('!')); // Verifica se o caractere é uma letra ou dígito
        System.out.println(Character.isUpperCase('A')); // Verifica se o caractere é maiúsculo
        System.out.println(Character.isLowerCase('a')); // Verifica se o caractere é minúsculo
        System.out.println(Character.toLowerCase('A')); // Converte o caractere para minúsculo
        System.out.println(Character.toUpperCase('a')); // Converte o caractere para maiúsculo

        // Autoboxing é o processo de conversão de um tipo primitivo para um objeto wrapper
        // Unboxing é o processo de conversão de um objeto wrapper para um tipo primitivo

    }
}
