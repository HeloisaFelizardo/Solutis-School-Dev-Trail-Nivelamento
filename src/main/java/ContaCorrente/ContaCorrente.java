package ContaCorrente;

public class ContaCorrente {
    private String numero;
    private String tipo;
    private Cliente primeiroTitular;
    private Cliente segundoTitular;
    private double saldo;
    private double limiteTotal;

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, double saldo, double limiteTotal) {
        this.numero = numero;
        this.tipo = tipo;
        this.primeiroTitular = primeiroTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
    }

    public void setSegundoTitular(Cliente segundoTitular) {
        this.segundoTitular = segundoTitular;
    }

    public void credito(double valor){
        saldo += valor;
    }

    public void debito(double valor){
        saldo -= valor;
    }

    public boolean estaDevedor(){
        return saldo < 0;
    }

    public void resumo(){
        System.out.println("Numero da conta corrente: " + numero);
        System.out.println("Nome do primeiro titular: " + primeiroTitular.getNome());
        System.out.println("Nome do primeiro titular: " + segundoTitular.getNome());
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Limite atual: " + (limiteTotal + saldo));
        System.out.println("Limite Total: " + limiteTotal);
        if (estaDevedor()){
            System.out.println("Procure seu gerente.");
        }
    }
}
