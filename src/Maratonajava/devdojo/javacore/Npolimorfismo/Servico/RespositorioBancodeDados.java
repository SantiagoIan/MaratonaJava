package Maratonajava.devdojo.javacore.Npolimorfismo.Servico;

import Maratonajava.devdojo.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RespositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados..");
    }
}
