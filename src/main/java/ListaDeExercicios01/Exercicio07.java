package ListaDeExercicios01;

/*7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .*/

public class Exercicio07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("Resultado da divisão de %d por 2 (int): %d%n", i, i / 2);
                System.out.printf("Resultado da divisão de %d por 2 (double): %.1f%n", i, (double) i / 2);
            }
        }
    }
}
