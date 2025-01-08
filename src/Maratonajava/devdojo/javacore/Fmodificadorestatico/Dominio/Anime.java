package Maratonajava.devdojo.javacore.Fmodificadorestatico.Dominio;

public class Anime {
    private String name;
    private static int[] eps;

    /* 0 - Bloco de inicialição é executado quando a JVM carregar a classe
    1 - Alocado espaço em memória para objeto
    2 - cada atributo de classe é criado e inicializado com valores default ou que for setado
    3 - bloco de inicialização é executado
    4 - Construtor é executado
     */

    static {
        System.out.println("Dentro do bloco de inicialização");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episodio : Anime.eps) {
            System.out.print(episodio + " ");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEps() {
        return eps;
    }

}


