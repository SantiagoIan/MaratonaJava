package Maratonajava.devdojo.javacore.Npolimorfismo.Dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTRO = 0.45;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }


    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da televisão");
        return this.valor * IMPOSTO_POR_CENTRO;
    }
}
