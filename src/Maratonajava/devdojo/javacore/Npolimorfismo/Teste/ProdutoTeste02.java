package Maratonajava.devdojo.javacore.Npolimorfismo.Teste;

import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Computador;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Produto;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("I7 7700K", 4300);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println();
        Produto produto2 = new Tomate("Vermelho", 12);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        System.out.println();

    }
}
