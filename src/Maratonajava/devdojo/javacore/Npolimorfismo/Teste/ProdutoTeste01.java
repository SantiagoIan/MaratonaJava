package Maratonajava.devdojo.javacore.Npolimorfismo.Teste;

import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Computador;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Televisao;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Tomate;
import Maratonajava.devdojo.javacore.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 7 7800", 7000);
        Tomate tomate = new Tomate("vermelho", 7);
        Televisao televisao = new Televisao("Samsung 70\" ", 14000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println();
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();
        CalculadoraImposto.calcularImposto(televisao);
    }
}
