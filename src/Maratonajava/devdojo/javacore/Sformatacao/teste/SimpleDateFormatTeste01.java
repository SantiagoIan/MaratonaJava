package Maratonajava.devdojo.javacore.Sformatacao.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        // SimpleDateFormat é uma classe que formata e analisa datas
        // Formato padrão: "dd/MM/yyyy"
        // Exemplo: 01/01/2023

        // Formato personalizado: "dd-MM-yyyy"
        // Exemplo: 01-01-2023

        // Formato com hora: "dd/MM/yyyy HH:mm:ss"
        // Exemplo: 01/01/2023 10:00:00

        // Formato com fuso horário: "dd/MM/yyyy HH:mm:ss Z"
        // Exemplo: 01/01/2023 10:00:00 -0300

        // '' é usado para escapar caracteres
        String masc = "'Japão' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(masc);
        System.out.println(sdf.format(new Date()));


    }
}
