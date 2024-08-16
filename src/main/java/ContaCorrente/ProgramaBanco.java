package ContaCorrente;

public class ProgramaBanco {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("123456789", "João", "Rua 1", "1990");
        Cliente cliente2 = new Cliente("987654321", "Maria", "Rua 2", "1992");

        ContaCorrente conta = new ContaCorrente("123456", "Conta Corrente", cliente1, 1000.0, 5000.0);
        conta.setSegundoTitular(cliente2);

        conta.credito(500.0);
        conta.debito(200.0);
        conta.credito(300.0);
        conta.debito(400.0);

        conta.resumo();
    }
}
