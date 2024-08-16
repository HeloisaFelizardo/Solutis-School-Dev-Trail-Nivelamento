package ContaCorrente;

public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String anoNascimento;

    public Cliente(String cpf, String nome, String endereco, String anoNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }
}
