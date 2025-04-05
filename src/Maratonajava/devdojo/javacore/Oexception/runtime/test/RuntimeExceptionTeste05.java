package Maratonajava.devdojo.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLPermission;

public class RuntimeExceptionTeste05 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalAccessError | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalAccessError | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        } finally {
            System.out.println("Dentro do finally");
        }
        // Execeções mais genericas devem vir por último, se não o compilador não compila.

        try {
            talvezLanceExcecao();
        } catch (SQLException | IOException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void talvezLanceExcecao() throws SQLException, IOException {
        // Lança uma exceção
        // throw new SQLException();
        // throw new FileNotFoundException();

    }

}
