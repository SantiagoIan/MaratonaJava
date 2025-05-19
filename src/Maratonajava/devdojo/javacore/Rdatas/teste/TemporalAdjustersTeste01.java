package Maratonajava.devdojo.javacore.Rdatas.teste;

import javax.sound.midi.Soundbank;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        // TemporalAdjusters é uma interface que define os campos de tempo e data

        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH,18); // Altera o dia do mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY ));
        System.out.println("\n"+now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SUNDAY ));
        System.out.println("\n"+now);
        System.out.println(now.getDayOfWeek());
    }
}
