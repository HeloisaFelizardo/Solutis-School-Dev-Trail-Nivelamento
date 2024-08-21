package TrabalhoDeClassePOO;

public class Chefe extends Trabalhador{
    private double salarioBase;
    private String matriculaPlano;
    private int qtdeDependentes;

    // Construtor de Chefe
    public Chefe(String nome, String sobrenome, double salarioBase, String matriculaPlano, int qtdeDependentes) {
        super(nome, sobrenome);
        this.salarioBase = salarioBase;
        this.matriculaPlano = matriculaPlano;
        this.qtdeDependentes = qtdeDependentes;
    }

    public String getMatriculaPlano() {
        return matriculaPlano;
    }

    public int getQtdeDependentes() {
        return qtdeDependentes;
    }

    public String getNomeCompletoTitular() {
        return getNome() + " " + getSobrenome();
    }

    public double gerarSalario() {
        // Implemente a lógica de cálculo do salário aqui
        return 0;
    }

    // Demais métodos da classe.
}
