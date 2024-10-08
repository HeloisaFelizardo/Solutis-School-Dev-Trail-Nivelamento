package Heranca;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carla", "Rua das azaleias", "5464813841");
        System.out.println("\nInformações da Pessoa 1:");
        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa("Alfredo", "561315613");
        pessoa2.setEndereco("Rua das Camélias");
        System.out.println("\nInformações da Pessoa 2:");
        System.out.println(pessoa2);

        Pessoa pessoa3 = new Pessoa("Carlos");
        pessoa3.setEndereco("Rua C");
        pessoa3.setTelefone("123123123");
        System.out.println("\nInformações da Pessoa 3:");
        System.out.println(pessoa3);

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Rubens");
        pessoa4.setEndereco("Rua Onze");
        pessoa4.setTelefone("454638643");
        System.out.println("\nInformações da Pessoa 4:");
        System.out.println(pessoa4);

        Fornecedor fornecedor1 = new Fornecedor(pessoa2, 10000.00, 7000.00);
        fornecedor1.setNome("Eduardo LTDA");
        fornecedor1.setEndereco("Rua Beta");
        fornecedor1.setTelefone("123123123");
        System.out.println("\nInformações do Fornecedor:");
        System.out.println(fornecedor1);

        fornecedor1.setValorCredito(20000.00);
        fornecedor1.setValorDivida(5000.00);

        System.out.println("\nInformações do Fornecedor alteradas:");
        System.out.println(fornecedor1);

        System.out.println();

        Empregado empregado1 = new Empregado(pessoa1, 101, 5000.00, 15.0);

        System.out.println("Informações do Empregado:");
        System.out.println(empregado1);

        empregado1.setCodigoSetor(102);
        empregado1.setSalarioBase(5500.00);
        empregado1.setImposto(10.0);

        System.out.println("\nInformações do Empregado após modificações:");
        System.out.println(empregado1);

        System.out.println();

        Administrador admin1 = new Administrador(pessoa3, 101, 5000.00, 15.0, 100.00);

        System.out.println("Informações do Administrador:");
        System.out.println(admin1);

        admin1.setAjudaDeCusto(200.00);

        System.out.println("\nInformações do Administrador após modificações:");
        System.out.println(admin1);

        System.out.println();

        Operario operario1 = new Operario(pessoa4, 202, 3000.00, 10.0, 10000.00, 5.0);

        System.out.println("Informações do Operário:");
        System.out.println(operario1);

        operario1.setValorProducao(5000.00);
        operario1.setComissao(7.5);

        System.out.println("\nInformações do Operário após modificações:");
        System.out.println(operario1);

        System.out.println();


        Vendedor vendedor1 = new Vendedor(pessoa2, 101, 2500.00, 12.0, 20000.00, 8.0);

        System.out.println("Informações do Vendedor:");
        System.out.println(vendedor1);

        vendedor1.setValorVendas(15000.00);
        vendedor1.setComissao(10.0);

        System.out.println("\nInformações do Vendedor após modificações:");
        System.out.println(vendedor1);
    }
}
