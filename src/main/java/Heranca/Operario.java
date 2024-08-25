package Heranca;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return getValorProducao() * (comissao / 100);
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
                "\nValor da Produção: " + getValorProducao() +
                "\nComissão: " + comissao + "%" +
                "\nValor da Comissão: " + getComissao();
    }
}
