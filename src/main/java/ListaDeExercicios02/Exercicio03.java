package ListaDeExercicios02;

/*Crie uma classe e na função main() implemente um programa que lê um número inteiro do teclado
e imprime todos os números primos menores que ele (divisíveis por 1 ou por ele mesmo).*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        imprimirNumerosPrimos(num);

        scan.close();
    }

    public static void imprimirNumerosPrimos(int num) {
        for (int i = 2; i < num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}

