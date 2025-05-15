package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        // LocalDateTime é uma classe que representa uma data e hora
        // Exemplo: 2023-01-01T10:00:00
        // Formato padrão: "yyyy-MM-dd'T'HH:mm:ss"
        // Formato personalizado: "dd/MM/yyyy HH:mm:ss"
        // Exemplo: 01/01/2023 10:00:00

        // é uma junção do LocalTime e LocalDate

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2025, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(23, 33, 30);
        System.out.println(dateTime);

        LocalDateTime ldt1 = date.atTime(time); // data + hora
        LocalDateTime ldt2 = time.atDate(date); // hora + data
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
