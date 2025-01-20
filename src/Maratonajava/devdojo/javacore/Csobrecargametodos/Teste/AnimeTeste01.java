package Maratonajava.devdojo.javacore.Csobrecargametodos.Teste;

import Maratonajava.devdojo.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Black clover", "Luta", 182);
        anime.setGenero("Animação");
        anime.imprime();
    }
}
