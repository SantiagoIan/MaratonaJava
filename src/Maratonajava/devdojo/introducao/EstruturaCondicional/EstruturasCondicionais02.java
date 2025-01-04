package Maratonajava.devdojo.introducao.EstruturaCondicional;
import java.util.Scanner;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade para saber qual modalidade você pode jogar:");
        int age = sc.nextInt();

        if (age < 15) {
            System.out.println("Categoria Infantil.");
        } else if (age < 18) { // mesma forma que (age >= 15 && age < 18).
            System.out.println("Categoria Juvenil.");
        } else {
            System.out.println("Categoria Adulto.");
        }
    }
}
