package HerancaEPolimorfismo.RegistroAcademico;

class EnsinoBasico extends Funcionario {
    private String escolaBasica;

    public EnsinoBasico(String nome, String codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    @Override
    public double getRendaTotal() {
        return rendaBasica + (rendaBasica * 0.10);
    }

    @Override
    public String getEscolaridade() {
        return "Ensino Básico";
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola (Ensino Básico): " + escolaBasica;
    }
}