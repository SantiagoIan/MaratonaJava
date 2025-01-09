package Maratonajava.devdojo.javacore.Gassociacao.Teste;

import Maratonajava.devdojo.javacore.Gassociacao.Dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Chigiri");
        Jogador jogador2 = new Jogador("Bachira");
        Jogador jogador3 = new Jogador("Isagi");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
        jogador.imprime();
        }

    }
}
