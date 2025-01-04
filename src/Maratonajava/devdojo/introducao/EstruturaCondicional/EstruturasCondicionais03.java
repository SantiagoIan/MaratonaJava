package Maratonajava.devdojo.introducao.EstruturaCondicional;
import java.util.Scanner;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Descubra se seu número é Par ou Ímpar");
        System.out.print("Digite um numero:");
        int number = sc.nextInt();
        String resultado;

        // Usando operador ternário para verificar se o número é par
        // resultado = expressao_booleana ? valor_se_verdadeiro : valor_se_falso;
        resultado = (number % 2 == 0) ? "par" : "ímpar";

        System.out.println("O número é " + resultado + ".");
    }
}
