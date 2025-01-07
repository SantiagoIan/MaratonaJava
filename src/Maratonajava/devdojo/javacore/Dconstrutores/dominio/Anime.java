package Maratonajava.devdojo.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String type;
    private int eps;
    private String genero;
    private String studio;



    public Anime(String name, String type, int eps, String genero, String studio) {
        this.name = name;
        this.type = type;
        this.eps = eps;
        this.genero = genero;
        this.studio = studio;
    }

    public void imprime() {
        System.out.println("Nome: " + this.name);
        System.out.println("Tipo: " + this.type);
        System.out.println("Epsodios: " + this.eps);
        System.out.println("Genero: " + this.genero);
        System.out.println("Studio: " + this.studio);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }
}
