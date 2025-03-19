package Maratonajava.devdojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");
    }

    /**
     * Método que realiza a divisão de dois números inteiros
     * @param num1 int - Número 1
     * @param num2 int - Número 2
     * @return
     * @throws IllegalArgumentException - Caso num2 seja 0
     */

    public static void divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
