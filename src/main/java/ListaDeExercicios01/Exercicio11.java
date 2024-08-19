package ListaDeExercicios01;

/*11. Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética
(utilize o método compareTo da classe String). Informe também, qual das palavras tem o maior número de caracteres.
 */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String str1 = scan.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String str2 = scan.nextLine();

        palavrasEmOrdemAlfabetica(str1, str2);

        scan.close();
    }

    public static void palavrasEmOrdemAlfabetica(String a, String b) {

        if (a.compareToIgnoreCase(b) < 0) {
            System.out.println(a);
            System.out.println(b);
        } else if (a.compareToIgnoreCase(b) > 0) {
            System.out.println(b);
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
        }

        if (a.length() > b.length()) {
            System.out.printf("A palavra \"%s\" tem o maior número de caracteres.%n", a);
        } else if (a.length() < b.length()) {
            System.out.printf("A palavra \"%s\" tem o maior número de caracteres.%n", b);
        } else {
            System.out.println("Ambas as palavras têm o mesmo número de caracteres.");
        }
    }
}
