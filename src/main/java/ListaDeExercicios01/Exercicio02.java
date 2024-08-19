package ListaDeExercicios02;

/*2. Faça um programa que receba 2 valores e retorne o maior entre eles.*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();

        System.out.println("O maior número é: " + maior(a, b));

        scan.close();
    }
    public static int maior(int a, int b){
        return Math.max(a, b);
    }
}
