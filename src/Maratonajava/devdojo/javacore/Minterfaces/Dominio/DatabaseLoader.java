package Maratonajava.devdojo.javacore.Minterfaces.Dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // privete -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados..");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados..");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
