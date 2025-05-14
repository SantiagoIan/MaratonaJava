package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime timenow = LocalTime.now(); // Hora atual
        LocalTime time = LocalTime.of(11,45,45); // 11:45:45
        System.out.println(time);
        System.out.println(timenow);

        System.out.println(time.getHour()); // Hora
        System.out.println(time.getMinute()); // Minuto
        System.out.println(time.getSecond()); // Segundo
        System.out.println(timenow.get(ChronoField.HOUR_OF_DAY)); // Hora do dia
        System.out.println(LocalTime.MIN); // Hora mínima
        System.out.println(LocalTime.MAX); // Hora máxima
    }
}
