package HerancaEPolimorfismo.RegistroAcademico;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new EnsinoBasico("João", "001", "Escola Básica A");
        funcionarios[1] = new EnsinoBasico("Maria", "002", "Escola Básica B");
        funcionarios[2] = new EnsinoBasico("José", "003", "Escola Básica C");
        funcionarios[3] = new EnsinoBasico("Ana", "004", "Escola Básica D");

        funcionarios[4] = new EnsinoMedio("Carlos", "005", "Escola Básica E", "Escola Média A");
        funcionarios[5] = new EnsinoMedio("Fernanda", "006", "Escola Básica F", "Escola Média B");
        funcionarios[6] = new EnsinoMedio("Rafael", "007", "Escola Básica G", "Escola Média C");
        funcionarios[7] = new EnsinoMedio("Clara", "008", "Escola Básica H", "Escola Média D");

        funcionarios[8] = new Graduacao("Pedro", "009", "Escola Básica I", "Escola Média E", "Universidade X");
        funcionarios[9] = new Graduacao("Luiza", "010", "Escola Básica J", "Escola Média F", "Universidade Y");

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario func : funcionarios) {
            double renda = func.getRendaTotal();
            custoTotal += renda;

            switch (func.getEscolaridade()) {
                case "Ensino Básico":
                    custoEnsinoBasico += renda;
                    break;
                case "Ensino Médio":
                    custoEnsinoMedio += renda;
                    break;
                case "Graduação":
                    custoGraduacao += renda;
                    break;
            }
        }

        System.out.printf("Custo Total da Empresa: R$ %.2f%n", custoTotal);
        System.out.printf("Custo com Ensino Básico: R$ %.2f%n", custoEnsinoBasico);
        System.out.printf("Custo com Ensino Médio: R$ %.2f%n", custoEnsinoMedio);
        System.out.printf("Custo com Graduação: R$ %.2f%n", custoGraduacao);
    }
}
