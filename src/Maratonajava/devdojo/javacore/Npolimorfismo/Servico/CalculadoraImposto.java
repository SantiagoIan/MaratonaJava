package Maratonajava.devdojo.javacore.Npolimorfismo.Servico;

import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Computador;
import Maratonajava.devdojo.javacore.Npolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostosComputador(Computador computador){
        System.out.println("Relatorio do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("imposto a ser pago "+ imposto);
    }

    public static void calcularImpostosTomate(Tomate tomate){
        System.out.println("Relatorio do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("imposto a ser pago "+ imposto);
    }
}
