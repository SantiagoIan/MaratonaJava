package Maratonajava.devdojo.javacore.Npolimorfismo.Dominio;

public class Computador extends Produto {
    public static final double IMPOSTO = 0.25;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO;
    }


}
