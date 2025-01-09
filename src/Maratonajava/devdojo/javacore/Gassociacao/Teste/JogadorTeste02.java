package Maratonajava.devdojo.javacore.Gassociacao.Teste;

import Maratonajava.devdojo.javacore.Gassociacao.Dominio.Jogador;
import Maratonajava.devdojo.javacore.Gassociacao.Dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bachira");
        Time timeZ = new Time("Time Z"); // Criamos o objetos

        jogador1.setTime(timeZ); // setamos o jogador 1 para o TimeZ

        jogador1.imprime(); // Imprimimos jogador e time fazendo a verificação na classe time.
    }
}
