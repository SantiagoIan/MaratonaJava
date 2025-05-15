package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        // Duration é usado para calcular o tempo entre duas datas
        // Exemplo: calcular o tempo entre duas datas

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter2Years = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration between = Duration.between(now, nowAfter2Years);
        Duration between2 = Duration.between(timeNow, timeMinus7Hours);
        System.out.println("between: " + between);
        System.out.println("between2: " + between2);


    }
}
