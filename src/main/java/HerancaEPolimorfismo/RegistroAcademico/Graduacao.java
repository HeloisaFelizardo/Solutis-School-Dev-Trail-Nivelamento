package HerancaEPolimorfismo.RegistroAcademico;

class Graduacao extends EnsinoMedio {
    private String universidade;

    public Graduacao(String nome, String codigoFuncional, String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia);
        this.universidade = universidade;
    }

    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() + super.getRendaTotal();
    }

    @Override
    public String getEscolaridade() {
        return "Graduação";
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola (Graduação): " + universidade;
    }
}
