package Maratonajava.devdojo.javacore.Eblocosdeinicializacao.Dominio;

public class Anime {
    private String name;
    private int[] eps;

    {
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

        for (int episodio : this.eps) {
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

    public void setEps(int[] eps) {
        this.eps = eps;
    }
}

