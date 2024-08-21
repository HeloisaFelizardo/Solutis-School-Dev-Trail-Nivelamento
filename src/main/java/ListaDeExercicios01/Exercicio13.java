package ListaDeExercicios0;

/*Escreva uma classe que imprima todas as possibilidades de que no lançamento
de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.
 */

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("Possibilidades de obter a soma 7 ao lançar dois dados:");

        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {
                    System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
                }
            }
        }
    }
}

