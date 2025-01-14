package Maratonajava.devdojo.javacore.Hheranca.Teste;

import Maratonajava.devdojo.javacore.Hheranca.Dominio.Endereco;
import Maratonajava.devdojo.javacore.Hheranca.Dominio.Funcionario;
import Maratonajava.devdojo.javacore.Hheranca.Dominio.Pessoa;

public class HenrancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Av. Paulista");
        endereco.setCep("02149-981");
        Pessoa pessoa = new Pessoa("Santiago");

        pessoa.setCpf("111.222.333.55");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Sandra");
        funcionario.setCpf("111.224.555-66");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(15000);

        System.out.println("---");
        funcionario.imprime();
        funcionario.relatorioSal();
    }
}
