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

        // Autoboxing é o processo de conversão de um tipo primitivo para um objeto wrapper
        // Unboxing é o processo de conversão de um objeto wrapper para um tipo primitivo

    }
}
