package ListaDeExercicios0;

/* Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:

001 ? Parafuso;
002 ? Porca;
003 ? Prego;

Para qualquer outro código: XXX ? Diversos.
*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        String cod = entrada.nextLine();

        if (cod.equals("001")) {
            System.out.println("Parafuso");
        } else if (cod.equals("002")) {
            System.out.println("Porca");
        } else if (cod.equals("003")) {
            System.out.println("Prego");
        } else {
            System.out.println("Diversos");
        }
    }
}
