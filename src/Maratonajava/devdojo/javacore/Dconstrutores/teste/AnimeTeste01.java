package Maratonajava.devdojo.javacore.Dconstrutores.teste;

import Maratonajava.devdojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Pokémon","TV", 1269, "Aventura, Fantasia", "OLM");
        anime.imprime();

        // Construtores são mais organizados do que sobrecarga de metodos, mas os dois tem a mesma funcionalidade

    }
}
