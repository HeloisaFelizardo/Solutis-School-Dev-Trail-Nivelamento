package ListaDeExercicios01;

/*9. Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2,
onde o raio (r) deve ser informado pelo usuário e o resultado terá que ser arredondado.
 */

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio: ");
        double r = scan.nextDouble();

        double A = Math.PI * r * r;

        long areaArredondado = Math.round(A);

        System.out.println("Área do círculo: " + areaArredondado);

        scan.close();
    }
}
