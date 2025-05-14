package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2005, Month.OCTOBER, 20);
        LocalDate datenow = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));
        System.out.println(date);
        System.out.println(datenow);
    }
}
