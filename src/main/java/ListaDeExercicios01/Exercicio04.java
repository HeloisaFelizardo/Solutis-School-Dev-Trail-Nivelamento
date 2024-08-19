package ListaDeExercicios01;

/*4. Pretende-se escrever um programa que leia do teclado uma distância
expressa em milhas, converte-a para quilômetros e apresenta o resultado no
console. (fórmula de conversão: 1 milha = 1.609 km).*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distância em milhas: ");
        double milhas = scan.nextDouble();

        double km = milhas * 1.609;
        System.out.println("A distância em quilômetros é: " + km + " km");

        scan.close();
    }
}
