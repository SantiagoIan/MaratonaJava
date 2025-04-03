package Maratonajava.devdojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo dentro do finally");
            // finally sempre executa, mesmo que ocorra uma exceção.
            // finally é usado para fechar recursos, como arquivos, conexões de banco de dados, etc.
            // finally é opcional, mas é uma boa prática usá-lo.
        }
        return null;
    }
}
