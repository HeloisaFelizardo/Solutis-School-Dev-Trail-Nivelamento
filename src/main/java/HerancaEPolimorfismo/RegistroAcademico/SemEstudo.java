package HerancaEPolimorfismo.RegistroAcademico;

public class SemEstudo extends Funcionario{

    public SemEstudo(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public String getEscolaridade() {
        return "Sem Estudo";
    }
}
