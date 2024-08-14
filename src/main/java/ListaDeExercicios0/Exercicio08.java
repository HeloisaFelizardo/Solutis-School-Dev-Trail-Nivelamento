package ListaDeExercicios0;

/*Escreva uma classe que verifica se um dado número inteiro é par ou ímpar. */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        }else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }
}
