package Maratonajava.devdojo.javacore.Aintroducaoclasses.teste;

import Maratonajava.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Volks";
        carro.modelo = "Voyage GL";
        carro.ano = 1987;

        carro2.nome = "Volks";
        carro2.modelo = "Gol GTI";
        carro2.ano = 1995;

        System.out.println("nome: " + carro.nome + "\nmodelo: " + carro.modelo + "\nano: " + carro.ano);
        System.out.println("==========================");
        System.out.println("nome: " + carro2.nome + "\nmodelo: " + carro2.modelo + "\nano: " + carro2.ano);
    }
}

