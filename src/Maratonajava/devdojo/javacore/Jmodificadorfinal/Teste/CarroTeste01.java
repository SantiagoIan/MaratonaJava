package Maratonajava.devdojo.javacore.Jmodificadorfinal.Teste;

import Maratonajava.devdojo.javacore.Jmodificadorfinal.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Mazda");
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
