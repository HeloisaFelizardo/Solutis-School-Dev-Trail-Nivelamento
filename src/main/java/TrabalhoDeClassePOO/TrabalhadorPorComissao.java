package TrabalhoDeClassePOO;

public class TrabalhadorPorComissao extends Trabalhador{

   private String matricula;
   private int quantidadeDependentes;

    public TrabalhadorPorComissao(String nome, String sobrenome, String matricula, int quantidadeDependentes) {
        super(nome, sobrenome);
        this.matricula = matricula;
        this.quantidadeDependentes = quantidadeDependentes;
    }

    public String getMatriculaPlano() {
        return matricula;
    }

    public int getQtdeDependentes() {
        return quantidadeDependentes;
    }

    public String getNomeCompletoTitular() {
        return getNome() + " " + getSobrenome();
    }


    public double gerarSalario() {
        return 0;
    }


}
