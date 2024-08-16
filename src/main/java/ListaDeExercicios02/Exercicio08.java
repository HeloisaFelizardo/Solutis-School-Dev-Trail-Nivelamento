package ListaDeExercicios02;

/* Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da
direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.
*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        palindromo(palavra);

        scan.close();
    }

    public static void palindromo(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        boolean ehPalindromo = true;
        int n = palavra.length();

        for (int i = 0; i < n / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(n - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("A palavra é um palíndromo!");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}
