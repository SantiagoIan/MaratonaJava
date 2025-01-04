package Maratonajava.devdojo.introducao.EstruturaCondicional;
import java.util.Scanner;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Descubra se o dia da semana ou final de semana.");
        System.out.print("Digite um número:");
        int number = sc.nextInt();

        switch (number) {
            case 2, 3, 4, 5, 6:
                System.out.println("Dia de semana.");
                break;
            case 1,7:
                System.out.println("Final de semana.");
                break;
            default:
                System.out.println("Dia invalido.");
        }

    }
}
