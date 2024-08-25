package Heranca;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(pessoa, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAjuda de Custo: " + ajudaDeCusto;
    }
}
