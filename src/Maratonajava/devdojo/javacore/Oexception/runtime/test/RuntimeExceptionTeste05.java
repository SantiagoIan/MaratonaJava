package Maratonajava.devdojo.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.sql.SQLPermission;

public class RuntimeExceptionTeste05 {
    public static void main(String[] args) {

        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalAccessError e) {
            System.out.println("Dentro do IllegalAccessError");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        } catch (Exception e) {
            System.out.println("Dentro do Exception");
        } finally {
            System.out.println("Dentro do finally");
        }
        // Execeções mais genericas devem vir por último, se não o compilador não compila.

        try {
            talvezLanceExcecao();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExcecao() throws SQLException, FileNotFoundException {
        // Lança uma exceção
        // throw new SQLException();
        // throw new FileNotFoundException();

    }

}
