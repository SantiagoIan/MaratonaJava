package Maratonajava.devdojo.javacore.Jmodificadorfinal.Teste;

import Maratonajava.devdojo.javacore.Jmodificadorfinal.Dominio.Carro;
import Maratonajava.devdojo.javacore.Jmodificadorfinal.Dominio.Mazda;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setNome("Mazda");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Santiago");
        System.out.println(carro.COMPRADOR);

        Mazda mazda = new Mazda();
        mazda.setNome("Rx7");
        mazda.imprime();

        // Modicador final em metodos e classes - em classes não podemos extender ela para outras classes, já em metodos nao podemos sobreescrever eles apenas na classe onde o metodo foi criado.

    }
}
