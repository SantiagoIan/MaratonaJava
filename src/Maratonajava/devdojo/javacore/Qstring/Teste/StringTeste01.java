package Maratonajava.devdojo.javacore.Qstring.Teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Santiago"; // String Constant pool
        String nome2 = "Santiago";
        nome = nome.concat(" Ian"); // Não altera o valor de nome, pois String é imutável
        System.out.println(nome);
        System.out.println(nome == nome2); // false (== usado para comparar referências)

        String nome3 = new String("Santiago"); // String Heap (não é uma String literal)
        System.out.println(nome2 == nome3); // false
        System.out.println(nome2 == nome3.intern()); // true (intern() retorna a referência da String no pool de Strings)

    }
}
