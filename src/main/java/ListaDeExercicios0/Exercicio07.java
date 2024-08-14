package ListaDeExercicios0;

/*
* 7. Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
* que a variável A passe a possuir o valor da variável B e que a variável B
* passe a possuir o valor da variável A. Apresentar os valores trocados.
*
* */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor para a variável A: ");
        int a = scan.nextInt();
        System.out.println("Digite um valor para a variável B: ");
        int b = scan.nextInt();

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Valor A: " + a);
        System.out.println("Valor B: " + b);
    }
}
