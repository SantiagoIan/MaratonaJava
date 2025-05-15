package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());

        // Instant trabalha com UTC (Tempo Universal Coordenado)
    }
}
