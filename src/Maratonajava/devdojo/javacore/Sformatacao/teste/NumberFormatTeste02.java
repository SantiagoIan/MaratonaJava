package Maratonajava.devdojo.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {

        Locale ptbr = new Locale("pt", "BR");
        Locale en = Locale.ENGLISH;
        Locale it = Locale.ITALY;
        Locale jp = Locale.JAPAN;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(it);
        nf[2] = NumberFormat.getCurrencyInstance(en);
        nf[3] = NumberFormat.getCurrencyInstance(jp);

        double valor = 1000.2132;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.getMaximumFractionDigits()); // ver quantas casas decimais
            System.out.println(numberFormat.format(valor));
        }

        System.out.println("-------------------------------------------------");
        String valorString = "1,000.21";
        try{
            System.out.println(nf[2].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();

        }
    }
}
