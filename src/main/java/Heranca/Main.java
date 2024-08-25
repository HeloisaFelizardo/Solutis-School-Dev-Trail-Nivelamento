package Heranca;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carla", "Rua das azaleias", "5464813841");
        System.out.println("\nInformações da Pessoa:");
        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa("Alfredo", "561315613");
        pessoa2.setEndereco("Rua das Camélias");

        System.out.println("\nInformações da Pessoa:");
        System.out.println(pessoa2);

        Pessoa pessoa3 = new Pessoa("Carlos");

        pessoa3.setEndereco("Rua C");
        pessoa3.setTelefone("123123123");

        System.out.println("\nInformações da Pessoa:");
        System.out.println(pessoa3);

        Pessoa pessoa4 = new Pessoa();

        pessoa4.setNome("Rubens");
        pessoa4.setEndereco("Rua Onze");
        pessoa4.setTelefone("454638643");

        System.out.println("\nInformações da Pessoa:");
        System.out.println(pessoa4);

        Fornecedor fornecedor1 = new Fornecedor(10000.00, 7000.00);

        fornecedor1.setNome("Eduardo");
        fornecedor1.setEndereco("Rua Beta");
        fornecedor1.setTelefone("123123123");
        System.out.println("\nInformações do Fornecedor:");
        System.out.println(fornecedor1);

        fornecedor1.setValorCredito(20000.00);
        fornecedor1.setValorDivida(5000.00);

        System.out.println("\nInformações do Fornecedor alteradas:");
        System.out.println(fornecedor1);

        System.out.println();

        Empregado empregado1 = new Empregado("João", "Rua A", "123456789", 101, 5000.00, 15.0);

        System.out.println("Informações do Empregado:");
        System.out.println(empregado1);

        empregado1.setCodigoSetor(102);
        empregado1.setSalarioBase(5500.00);
        empregado1.setImposto(10.0);

        System.out.println("\nInformações do Empregado após modificações:");
        System.out.println(empregado1);

        System.out.println();

        Administrador admin1 = new Administrador("Ana", "Avenida Central", "123456789", 101, 5000.00, 15.0, 100.00);

        System.out.println("Informações do Administrador:");
        System.out.println(admin1);

        admin1.setAjudaDeCusto(200.00);

        System.out.println("\nInformações do Administrador após modificações:");
        System.out.println(admin1);

        System.out.println();

        Operario operario1 = new Operario("Carlos", "Rua B", "987654321", 202, 3000.00, 10.0, 10000.00, 5.0);

        System.out.println("Informações do Operário:");
        System.out.println(operario1);

        operario1.setValorProducao(5000.00);
        operario1.setComissao(7.5);

        System.out.println("\nInformações do Operário após modificações:");
        System.out.println(operario1);
    }
}
