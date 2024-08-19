package ListaDeExercicios02;

/*12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e
a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo
Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros)
para cada tanque cheio. O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e
imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto.
Todos os cálculos de média devem produzir resultados de ponto flutuante.
*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalKm = 0;
        int totalLitros = 0;
        int tanque = 0;

        while (true) {
            int km = 0;
            int litros = 0;

            // Verifica a entrada de quilômetros
            while (true) {
                System.out.print("Quilômetros dirigidos por cada tanque cheio: ");
                if (scan.hasNextInt()) {
                    km = scan.nextInt();
                    if (km < 0) {
                        System.out.println("O valor de quilômetros não pode ser negativo. Tente novamente.");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite um número inteiro para quilômetros.");
                    scan.next();
                }
            }

            // Verifica a entrada de litros
            while (true) {
                System.out.print("Litros de gasolina consumidos por cada tanque cheio: ");
                if (scan.hasNextInt()) {
                    litros = scan.nextInt();
                    if (litros <= 0) {
                        System.out.println("O valor de litros deve ser maior que zero. Tente novamente.");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite um número inteiro para litros.");
                    scan.next();
                }
            }

            totalKm += km;
            totalLitros += litros;
            tanque++;

            double consumo = (double) km / litros;
            System.out.printf("Consumo para o tanque %d: %.2f km/l\n", tanque, consumo);

            System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
            if (scan.hasNextInt()) {
                int input = scan.nextInt();
                if (input == 0) {
                    break;
                }
            } else {
                System.out.println("Entrada inválida. Encerrando o programa.");
                break;
            }
        }

        // Exibe o total da quilometragem e o consumo médio
        if (totalLitros > 0) {
            double consumoMedio = (double) totalKm / totalLitros;
            System.out.printf("Quilometragem total: %d km\n", totalKm);
            System.out.printf("Total de litros de combustível consumidos: %d litros\n", totalLitros);
            System.out.printf("Consumo médio total: %.2f km/l\n", consumoMedio);
        } else {
            System.out.println("Nenhum dado de combustível foi registrado.");
        }

        System.out.println("Programa encerrado.");
        scan.close();
    }
}
