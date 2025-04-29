package Maratonajava.devdojo.javacore.Qstring.Teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Santiago Ian";
        nome = nome.concat(" Ferreira Aragão");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Santiago Ian"); //tamanho padrão 16
        sb.append(" Ferreira").append(" Aragão"); // adiciona ao final da String
        sb.reverse();
        System.out.println(sb);

        // Usamos o StringBuilder quando precisamos de um objeto mutável, ou seja, que pode ser alterado após a sua criação.
    }
}
