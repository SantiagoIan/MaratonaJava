package Maratonajava.devdojo.javacore.Npolimorfismo.Servico;

import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Computador;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Produto;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    public static  void calcularImposto(Produto produto){
        System.out.println("--- Relatorio Imposto ---");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);

        // "instanceof" testa a presença da função construtora no prototype do objeto.
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de Validade do Tomate: "+tomate.getDataValidade());
        }
    }
}
