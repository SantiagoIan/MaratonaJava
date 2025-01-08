package Maratonajava.devdojo.javacore.Fmodificadorestatico.Teste;

import Maratonajava.devdojo.javacore.Fmodificadorestatico.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Civic EG6",180);
        Carro carro2 = new Carro("Civic G8", 280);
        Carro carro3 = new Carro("Audi R8", 310);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
