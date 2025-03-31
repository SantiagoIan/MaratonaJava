package Maratonajava.devdojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally sempre executa");
        }

    }

    /**
     *
     * @param a
     * @param b Não pode ser 0
     * @return
     * @throws ArithmeticException Se b for 0
     */

    // Não deixar que o usuário entre com valores inválidos, tratando com uma exceção.
    // Validação de entrada.

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}
