package Maratonajava.devdojo.introducao.EstruturaCondicional;
import java.util.Scanner;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Descubra se seu número é positivo ou negativo.");
        System.out.println("====================");
        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

    }
}
