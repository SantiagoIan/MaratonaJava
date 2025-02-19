package Maratonajava.devdojo.javacore.Npolimorfismo.Teste;

import Maratonajava.devdojo.javacore.Npolimorfismo.Repositorio.Repositorio;
import Maratonajava.devdojo.javacore.Npolimorfismo.Servico.RespositorioArquivo;
import Maratonajava.devdojo.javacore.Npolimorfismo.Servico.RespositorioBancodeDados;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RespositorioBancodeDados();
        repositorio.salvar();
        Repositorio repositorio1 = new RespositorioArquivo();
        repositorio1.salvar();
    }
}
