package Maratonajava.devdojo.javacore.Qstring.Teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "     Asta     ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // A
        System.out.println(nome.charAt(1)); // s
        System.out.println(nome.charAt(2)); // t
        System.out.println(nome.charAt(3)); // a
        System.out.println(nome.length()); // 4
        System.out.println(nome.replace("Y", "A"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.length()); // 6
        System.out.println(numeros.substring(0,2)); // 01
        System.out.println(numeros.substring(2,4)); // 23
        System.out.println(nome.trim()); // limpa os espaços em branco no início e no fim da String
    }
}
