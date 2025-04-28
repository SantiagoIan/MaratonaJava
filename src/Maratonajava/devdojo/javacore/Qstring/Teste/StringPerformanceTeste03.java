package Maratonajava.devdojo.javacore.Qstring.Teste;

public class StringPerformanceTeste03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar StringBuffer: " + (fim - inicio) + "ms");

        // String é imutável, ou seja, não pode ser alterada após a sua criação.
        // StringBuilder e StringBuffer são mutáveis, ou seja, podem ser alteradas após a sua criação.
        // StringBuilder é mais rápida que StringBuffer, pois não é sincronizada.
        // StringBuffer é sincronizada, ou seja, é thread-safe.
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }

    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }
}
