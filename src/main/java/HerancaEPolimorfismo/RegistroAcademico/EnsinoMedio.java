package HerancaEPolimorfismo.RegistroAcademico;

class EnsinoMedio extends EnsinoBasico {
    private String escolaMedia;

    public EnsinoMedio(String nome, String codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() + (super.getRendaTotal() * 0.50);
    }

    @Override
    public String getEscolaridade() {
        return "Ensino Médio";
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola (Ensino Médio): " + escolaMedia;
    }
}
