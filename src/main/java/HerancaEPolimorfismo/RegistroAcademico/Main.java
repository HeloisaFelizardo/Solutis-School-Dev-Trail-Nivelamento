package HerancaEPolimorfismo.RegistroAcademico;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new SemEstudo("João Silva", "001");
        Funcionario funcionario2 = new EnsinoBasico("Debora Duarte", "002", "Escola Primária XYZ");
        Funcionario funcionario3 = new EnsinoMedio("Carlos", "005", "Escola Básica E", "Escola Média A");
        Funcionario funcionario4 = new Graduacao("Pedro", "009", "Escola Básica I", "Escola Média E", "Universidade X");

        System.out.println(funcionario1);
        System.out.println();
        System.out.println(funcionario2);
        System.out.println();
        System.out.println(funcionario3);
        System.out.println();
        System.out.println(funcionario4);

    }
}
