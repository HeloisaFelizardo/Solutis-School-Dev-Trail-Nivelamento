package Heranca;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(Pessoa pessoa, double valorCredito, double valorDivida) {
        super(pessoa.getNome(), pessoa.getTelefone());
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
                "\nValor Crédito: " + valorCredito +
                "\nValor Dívida: " + valorDivida +
                "\nSaldo: " + obterSaldo();
    }
}
