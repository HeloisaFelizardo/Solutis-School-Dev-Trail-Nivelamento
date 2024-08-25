package Heranca;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida) {
        super();
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
            return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nValor Crédito: " + getValorCredito() +
                "\nValor Dívida: " + getValorDivida() +
                "\nSaldo: " + obterSaldo();
    }
}
