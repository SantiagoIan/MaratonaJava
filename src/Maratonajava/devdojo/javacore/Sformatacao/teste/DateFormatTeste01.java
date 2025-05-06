package Maratonajava.devdojo.javacore.Sformatacao.teste;

import java.util.Calendar;
import java.text.DateFormat;

public class DateFormatTeste01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for ( DateFormat DateFormat : df) {
            System.out.println(DateFormat.format(c.getTime()));
        }
    }
}

