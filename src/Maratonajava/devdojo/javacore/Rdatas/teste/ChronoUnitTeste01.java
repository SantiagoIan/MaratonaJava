package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        // ChronoUnit é uma interface que define os campos de tempo e data
        // Exemplo: calcular o tempo entre duas datas

        LocalDateTime aniversary = LocalDateTime.of(2005, Month.OCTOBER, 20, 00, 45);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversary,now));
        System.out.println(ChronoUnit.WEEKS.between(aniversary,now));
        System.out.println(ChronoUnit.MONTHS.between(aniversary,now));
        System.out.println(ChronoUnit.YEARS.between(aniversary,now));
    }
}
