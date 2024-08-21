package TrabalhoDeClassePOO;

public class Main {
    public static void main(String[] args) {
        // Criação dos trabalhadores
        Trabalhador chefe1 = new Chefe("Antonio", "Pereira", 4500, "32534534", 1);
        Trabalhador chefe2 = new Chefe("Marcos", "Vinicius", 5000, "4634634", 0);
        Trabalhador trabalhador1 = new TrabalhadorPorComissao("Joao", "Silva", "43523532", 2);
        Trabalhador trabalhador2 = new TrabalhadorPorComissao("Maria", "Silva", "433452345", 2);

        // Criação de um vetor para armazenar todos os trabalhadores
        SeguroSaude[] trabalhadores = new SeguroSaude[4];
        trabalhadores[0] = chefe1;
        trabalhadores[1] = chefe2;
        trabalhadores[2] = trabalhador1;
        trabalhadores[3] = trabalhador2;

        // Imprime a legislação do seguro
        System.out.println("Legislação do seguro: " + SeguroSaude.LEGISLACAO);
        System.out.println();

        // Loop para imprimir as informações de cada trabalhador
        for (SeguroSaude trabalhador : trabalhadores) {
            System.out.println("Matrícula: " + trabalhador.getMatriculaPlano());
            System.out.println("Nome completo: " + trabalhador.getNomeCompletoTitular());
            System.out.println("Quantidade de dependentes: " + trabalhador.getQtdeDependentes());
            System.out.println();
        }

        // Associar trabalhadores operacionais ao clube
        AssociacaoClube[] associados = new AssociacaoClube[2];
        associados[0] = trabalhador1;
        associados[1] = trabalhador2;

        // Imprime as informações dos associados ao clube
        System.out.println("Informações dos associados ao clube:");
        for (AssociacaoClube associado : associados) {
            System.out.println("Nome: " + associado.getNomeCompletoTitular());
            System.out.println("Matrícula: " + associado.getMatriculaPlano());
            System.out.println("Quantidade de dependentes: " + associado.getQtdeDependentes());
            System.out.println();
        }
    }
}
