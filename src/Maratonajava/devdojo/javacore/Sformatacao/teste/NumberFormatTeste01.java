package Maratonajava.devdojo.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {

        Locale ptbr = new Locale("pt", "BR");
        Locale en = Locale.ENGLISH;
        Locale it = Locale.ITALY;
        Locale jp = Locale.JAPAN;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(it);
        nf[2] = NumberFormat.getInstance(en);
        nf[3] = NumberFormat.getInstance(jp);

        float valor = 1_000.2132f;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }
        System.out.println("-------------------------------------------------");
        String valorString = "1.000,2132";
        try{
            System.out.println(nf[0].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();

        }
    }
}
