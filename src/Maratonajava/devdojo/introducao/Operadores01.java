package Maratonajava.devdojo.introducao;

import java.util.Scanner;

public class Operadores01 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = dados.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = dados.nextInt();

        boolean maior = num > num2;


        System.out.println("Seu número mais 1: " + ++num);
        System.out.println("Seu número menos 1: " + --num);
        System.out.println(num + " é maior que " + num2 + " ? " + maior);
    }
}
