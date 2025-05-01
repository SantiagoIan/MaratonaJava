package Maratonajava.devdojo.javacore.Rdatas.teste;

import java.util.Calendar;

public class CalenderTeste01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // Pega a data atual
        if ( c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo");
        } else if (c.getFirstDayOfWeek() == Calendar.MONDAY) {
            System.out.println("Segunda");
        } else if (c.getFirstDayOfWeek() == Calendar.TUESDAY) {
            System.out.println("Terça");
        } else if (c.getFirstDayOfWeek() == Calendar.WEDNESDAY) {
            System.out.println("Quarta");
        } else if (c.getFirstDayOfWeek() == Calendar.THURSDAY) {
            System.out.println("Quinta");
        } else if (c.getFirstDayOfWeek() == Calendar.FRIDAY) {
            System.out.println("Sexta");
        } else if (c.getFirstDayOfWeek() == Calendar.SATURDAY) {
            System.out.println("Sábado");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // Dia do mês
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // Dia da semana
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // Dia do ano
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // Dia da semana no mês

        c.add(Calendar.DAY_OF_MONTH, 4);
        System.out.println(c.getTime());
    }
}
