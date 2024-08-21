package ExerciciosDeClasse;

/*No programa anterior, existe uma variável que não foi inicializada. Qual foi?

    int qtdeIrmaos

Faça as seguintes alterações no programa anterior, salve, compile e,
caso algum problema aconteça, descreva o que aconteceu e qual o seu palpite para a solução do mesmo.

Incluir a impressão da variável qtdeIrmaos.
R: Erro de inicialização de variárvel.
O erro ocorre porque a variavel não foi inicializada. Para resolver o problema foi atribuido um valor para ela.

Alterar o tipo da variável minhaAltura para float.
R: Erro de tipos incompatíveis. O código  não compila pois todos os literais com ponto flutuante
são considerados double pelo Java. E float não pode receber um double sem perda de informação,
para fazer isso funcionar podemos escrever a letra f após o número. A letra f, que pode ser maiúscula ou minúscula,
indica que aquele literal deve ser tratado como float.

Alterar o tipo da variável sexo para String
R: Erro de conversão de tipos imcompatíveis.
O erro ocorre porque está tentando atribuir um valor de tipo char a uma variável do tipo String,
e os tipos são incompatíveis. Para resolver o problema troquei as aspas simples por aspas duplas.
*/

public class VariaveisConstantes02 {
    public static void main(String[] args) {
        int qtdeIrmaos = 2 ;
        String sexo= "F";
        float minhaAltura= 1.65f;
        String meuNome="Rosi Teixeira";
        final int MES_NASCIMENTO = 12;

        System.out.println("Olá! Meu nome é " + meuNome);
        System.out.println("Sexo : " + sexo);
        System.out.println("Altura : " + minhaAltura);
        System.out.println("Mes de Nascimento : " + MES_NASCIMENTO);
        System.out.println("Quantidade de irmãos: " + qtdeIrmaos);
    }
}
