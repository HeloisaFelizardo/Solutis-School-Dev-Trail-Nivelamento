package Heranca;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto; // Porcentagem do imposto sobre o salário base

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCódigo do Setor: " + getCodigoSetor() +
                "\nSalário Base: " + getSalarioBase() +
                "\nImposto: " + getImposto() + "%" +
                "\nSalário Líquido: " + calcularSalario();
    }
}