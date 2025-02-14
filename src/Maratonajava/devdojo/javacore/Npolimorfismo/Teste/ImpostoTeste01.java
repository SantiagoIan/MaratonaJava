package Maratonajava.devdojo.javacore.Npolimorfismo.Teste;

import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Computador;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Produto;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Tomate;
import Maratonajava.devdojo.javacore.Npolimorfismo.Servico.CalculadoraImposto;

public class ImpostoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 7 7800", 7000);
        Tomate tomate = new Tomate("vermelho", 7);

        CalculadoraImposto.calcularImpostosComputador(computador);
        System.out.println();
        CalculadoraImposto.calcularImpostosTomate(tomate);
    }
}
