package ListaDeExercicios02;

/*6. Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.*/

public class Exercicio06 {
    public static void main(String[] args) {

        int produtoInt = 1;

        float produtoFloat = 1.0f;

        for (int i = 15; i <= 30 ; i++) {
            if(i % 2 != 0){
                produtoInt *= i;
                produtoFloat *= i;
            }
        }
        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + produtoInt);
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + produtoFloat);
    }
}
