package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.time.LocalDate;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2Years = LocalDate.now().plusYears(2);
        Period period1 = Period.between(now, nowAfter2Years);
        Period period2 = Period.ofDays(10);
        Period period3 = Period.ofWeeks(48); // Period, nao trabalha com semanas
        Period period4 = Period.ofMonths(3);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println();

        System.out.println(now.until(now.plusDays(period3.getDays()), ChronoUnit.MONTHS));
    }
}
