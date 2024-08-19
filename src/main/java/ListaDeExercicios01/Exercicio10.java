package ListaDeExercicios01;

/*10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma cadeia de caracteres: ");
        String frase = scan.nextLine();

        cadeiaCaracteres(frase);

        scan.close();
    }
    public static void cadeiaCaracteres(String frase) {
        frase = frase.toLowerCase();
        int qtdVogais = 0;
        int qtdConsoantes = 0;
        int qtdEspacoEmBranco = 0;

        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                qtdVogais++;
            } else if (Character.isWhitespace(ch)) {
                qtdEspacoEmBranco++;
            } else if (Character.isLetter(ch)) {
                qtdConsoantes++;
            }
        }

        System.out.println("Quantidade de vogais: " + qtdVogais);
        System.out.println("Quantidade de consoantes: " + qtdConsoantes);
        System.out.println("Quantidade de espaços em branco: " + qtdEspacoEmBranco);
    }
}
