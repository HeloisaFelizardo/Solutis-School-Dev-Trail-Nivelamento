package ExerciciosDeClasse;

/*Dado uma variável x com valor 13, faça um programa que transforme x da seguinte forma:
se x é par, y=x/2
se x é impar, y=3*x+1
imprime y
neste ponto o programa deve então jogar o valor de y em x e começar tudo de novo enquanto y seja diferente de 1.*/

public class ParOuImpar {
    public static void main(String[] args) {
        int x = 13;
        int y = 0;

        while (x != 1) {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }
            System.out.println(y);
            x = y;
        }
    }
}
