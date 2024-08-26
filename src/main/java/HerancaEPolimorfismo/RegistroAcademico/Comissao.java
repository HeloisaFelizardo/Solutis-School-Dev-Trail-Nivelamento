package HerancaEPolimorfismo.RegistroAcademico;

public abstract class Comissao {
    protected double salarioBase;

    public Comissao(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioTotal();
}
