package Heranca;

public class Vendedor extends Empregado{

    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return getValorVendas() * (comissao / 100);
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getComissao();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nValor da Produção: " + getValorVendas() +
                "\nComissão: " + comissao + "%" +
                "\nValor da Comissão: " + getComissao();
    }
}