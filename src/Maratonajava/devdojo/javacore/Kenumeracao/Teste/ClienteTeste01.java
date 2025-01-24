package Maratonajava.devdojo.javacore.Kenumeracao.Teste;

import Maratonajava.devdojo.javacore.Kenumeracao.Dominio.Cliente;
import Maratonajava.devdojo.javacore.Kenumeracao.Dominio.TipoCliente;
import Maratonajava.devdojo.javacore.Kenumeracao.Dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Santiago", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Sandra", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DIBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DIBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);

    }
}
