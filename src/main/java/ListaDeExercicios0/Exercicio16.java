package ListaDeExercicios0;


public class Exercicio16 {
    public static void main(String[] args) {
        int x = 13;
        int y = 0;

        while (x != 1){
            if( x % 2 == 0 ){
                y = x / 2;
            }else  {
                y = 3 * x + 1;
            }
            System.out.println(y);
            x = y;
        }
    }
}