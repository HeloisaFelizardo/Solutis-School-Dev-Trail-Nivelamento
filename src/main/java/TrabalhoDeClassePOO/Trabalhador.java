package TrabalhoDeClassePOO;

public abstract class Trabalhador implements SeguroSaude, AssociacaoClube{
    private String nome;
    private String sobrenome;

    public Trabalhador(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public abstract double gerarSalario();

}
