package ListaDeExercicios0;

/*Refaça o programa anterior utilizando a estrutura do while. */

import java.util.Scanner;

public class Exercico15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        double soma = 0;
        do {
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();
            soma += numero;
            i++;
        } while (i < 50);
        double media = soma / 50;
        System.out.println("A média é: " + media);
    }
}