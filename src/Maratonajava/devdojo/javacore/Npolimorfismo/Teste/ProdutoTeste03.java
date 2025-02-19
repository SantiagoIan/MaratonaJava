package Maratonajava.devdojo.javacore.Npolimorfismo.Teste;

import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Computador;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Produto;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Tomate;
import Maratonajava.devdojo.javacore.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto computador = new Computador("I7 7700K", 4300);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println();
        Tomate tomate = new Tomate("Vermelho", 12);
        tomate.setDataValidade("11/03/2025");
        CalculadoraImposto.calcularImposto(tomate);



    }
}
