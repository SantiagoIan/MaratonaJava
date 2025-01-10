package Maratonajava.devdojo.javacore.Gassociacao.Teste;

import Maratonajava.devdojo.javacore.Gassociacao.Dominio.Jogador;
import Maratonajava.devdojo.javacore.Gassociacao.Dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------------ Jogador");
        jogador.imprime();
        System.out.println("------------ Time");
        time.imprime();
    }
}
