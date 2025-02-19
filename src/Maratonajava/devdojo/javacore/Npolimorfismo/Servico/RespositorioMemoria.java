package Maratonajava.devdojo.javacore.Npolimorfismo.Servico;

import Maratonajava.devdojo.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RespositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
