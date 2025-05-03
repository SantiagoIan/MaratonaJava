package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");

        Calendar c = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Italy: " + df1.format(c.getTime()));
        System.out.println("Suiça: " + df2.format(c.getTime()));
        System.out.println("India:" + df3.format(c.getTime()));
        System.out.println("Japão: " + df4.format(c.getTime()));

        System.out.println("----------------------------------------");
        System.out.println(localeSuica.getDisplayCountry(localeSuica));
        System.out.println(localeJapao.getDisplayCountry());
        System.out.println(localeJapao.getDisplayLanguage(localeItaly));
    }
}
