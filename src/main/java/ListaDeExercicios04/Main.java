package ListaDeExercicios04;

public class Main {
    public static void main(String[] args) {

        AnimalTerrestreAB cachorro = new Cachorro("Ane", 2, "Cidade", 0.5, 5.0, 4 );
        AnimalTerrestreAB gato = new Gato("Dede", 2, "Cidade", 0.5, 5.0, 4 );
        AnimalTerrestreAB elefante = new Elefante("Luna", 3, "Savana", 2, 5, 4);
        AnimalTerrestreAB leao = new Leao("Simba", 3, "Savana", 1.5, 5, 4);
        AnimalMarinhoAB peixe = new Peixe("Nemo", 2, "Oceano", 0.3, 5.0, 100);
        AnimalVoadorAB pombo = new Pombo("Pidgey", 1, "Cidade", 0.2, 0.5,  0.4);

        // Definindo atributos através dos métodos
        cachorro.comer(10);
        cachorro.comer(10);
        cachorro.andar(20);
        cachorro.dormir(8);
        cachorro.andar(5);
        cachorro.dormir(4);
        System.out.println(cachorro);

        System.out.println();

        gato.comer(5);
        gato.comer(5);
        gato.andar(10);
        gato.dormir(12);
        gato.andar(4);
        gato.dormir(5);
        System.out.println(gato);

        System.out.println();

        elefante.comer(10);
        elefante.comer(10);
        elefante.andar(100);
        elefante.dormir(10);
        elefante.andar(30);
        elefante.dormir(4);
        System.out.println(elefante);

        System.out.println();

        leao.comer(15);
        leao.comer(20);
        leao.andar(60);
        leao.dormir(10);
        leao.andar(15);
        leao.comer(17);
        leao.dormir(5);
        System.out.println(leao);

        System.out.println();

        peixe.comer(10);
        peixe.comer(10);
        peixe.nadar(20);
        peixe.dormir(8);
        peixe.nadar(15);
        peixe.dormir(4);
        System.out.println(peixe);

        System.out.println();

        pombo.comer(5);
        pombo.comer(5);
        pombo.voar(100);
        pombo.dormir(10);
        pombo.voar(50);
        pombo.dormir(6);
        System.out.println(pombo);
    }
}
