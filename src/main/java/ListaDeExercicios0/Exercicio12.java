package ListaDeExercicios0;

/*
 Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100,
 usando os tipos de dados int e double .
 */

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println("Resultado da divisão por 2 de todos os " +
                "múltiplos de 3 entre 1 e 100 usando os tipos de dados int e double:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                double resultadoDouble = (double) i / 2;

                System.out.println("Resultado (int): "+ i + " / 2 = "  + resultadoInt);
                System.out.println("Resultado (double): " + i + " / 2 = " + resultadoDouble);
                System.out.println();
            }
        }
    }
}

