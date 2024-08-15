package ListaDeExercicios02;

/*7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .*/

public class Exercicio07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Resultado da divisão de " + i + " por 2 (int): " + (i / 2));
                System.out.println("Resultado da divisão de " + i + " por 2 (double): " + ((double) i / 2));
            }
        }
    }
}
