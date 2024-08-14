package ListaDeExercicios0;

/*No programa anterior, existe uma variável que não foi inicializada. Qual foi?

    int qtdeIrmaos

Faça as seguintes alterações no programa anterior, salve, compile e,
caso algum problema aconteça, descreva o que aconteceu e qual o seu palpite para a solução do mesmo.

Incluir a impressão da variável qtdeIrmaos.
R: a variavel não foi inicializada. Para resolver o problema foi atribuido um valor para ela.

Alterar o tipo da variável minhaAltura para float.
R: O problema é que float não aceita aspas simples. Toquei para aspas

Alterar o tipo da variável sexo para String
*/

public class VariaveisConstantes02 {
    public static void main(String[] args) {
        int qtdeIrmaos = 2;
        String sexo="F";
        float minhaAltura= 1.65F;
        String meuNome="Rosi Teixeira";
        final int MES_NASCIMENTO = 12;

        System.out.println("Olá! Meu nome é " + meuNome);
        System.out.println("Sexo : " + sexo);
        System.out.println("Altura : " + minhaAltura);
        System.out.println("Mes de Nascimento : " + MES_NASCIMENTO);
        System.out.println("Quantidade de irmãos: " + qtdeIrmaos);
    }
}
