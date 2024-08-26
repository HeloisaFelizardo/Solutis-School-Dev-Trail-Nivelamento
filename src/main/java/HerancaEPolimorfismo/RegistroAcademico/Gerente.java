package HerancaEPolimorfismo.RegistroAcademico;

public class Gerente extends Comissao {
    private static final double ADICIONAL = 1500.00;

    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + ADICIONAL;
    }
}
