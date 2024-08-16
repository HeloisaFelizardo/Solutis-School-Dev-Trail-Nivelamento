package ListaDeExercicios02;

/*5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da semana correspondente.
Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] diasDaSemana = {"Segunda", "Terça" , "Quarta" , "Quinta" , "Sexta" , "Sábado", "Domingo"};

        System.out.println("Digite um número de 1 a 7: ");
        int numero = scan.nextInt();

        if(numero < 1 || numero > 7){
            System.out.println("Número inválido");
        }else{
            System.out.println(diasDaSemana[numero - 1]);
        }

        scan.close();
    }
}
