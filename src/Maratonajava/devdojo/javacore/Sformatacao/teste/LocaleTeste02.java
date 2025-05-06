package Maratonajava.devdojo.javacore.Sformatacao.teste;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] paises = Locale.getISOCountries();
        String[] linguas = Locale.getISOLanguages();
        for (String pais : paises) {
            System.out.print(pais + " ");
        }
        System.out.println();
        for (String lingua : linguas) {
            System.out.print(lingua + " ");
        }
    }
}
