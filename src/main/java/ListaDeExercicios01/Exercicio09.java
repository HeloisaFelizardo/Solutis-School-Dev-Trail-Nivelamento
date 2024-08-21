package ListaDeExercicios0;

/* Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.*/

public class Exercicio09 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            System.out.println("O quadrado de " + i + " é: " + square);
        }
    }
}
