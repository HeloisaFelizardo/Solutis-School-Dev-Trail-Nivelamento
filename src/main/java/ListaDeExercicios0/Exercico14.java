package ListaDeExercicios0;

/*Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles. (Pesquise sobre como realizar entrada de dados)*/

import java.util.Scanner;

public class Exercico14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        double soma = 0;
        while (i < 50) {
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();
            soma += numero;
          i++;
        }
        double media = soma / 50;
        System.out.println("A média é: " + media);
    }
}
