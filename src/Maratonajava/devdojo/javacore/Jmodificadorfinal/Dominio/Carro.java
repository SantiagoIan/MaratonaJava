package Maratonajava.devdojo.javacore.Jmodificadorfinal.Dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;
    public final Comprador COMPRADOR = new Comprador();
    //Constantes - uma vez criados vão continuar com determinado valor até você mudar ela.

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
