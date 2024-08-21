package ListaDeExercicios0;

/*Escreva uma classe que verifica se um dado número inteiro é par ou ímpar. */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        }else {
            System.out.println("O número " + num + " é ímpar");
        }
    }
}
