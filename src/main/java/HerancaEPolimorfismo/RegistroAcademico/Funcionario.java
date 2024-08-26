package HerancaEPolimorfismo.RegistroAcademico;

class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica = 1000.00;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaTotal() {
        return rendaBasica;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public String getEscolaridade() {
        return "Nenhum";
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCódigo Funcional: " + getCodigoFuncional();

    }
}