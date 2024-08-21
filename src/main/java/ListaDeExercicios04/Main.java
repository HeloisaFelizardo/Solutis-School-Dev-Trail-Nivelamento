package ListaDeExercicios04;

public class Main {
    public static void main(String[] args) {

       /* AnimalAB cachorro = new Cachorro(50, 50, 8);
        AnimalAB gato = new Gato(10, 15, 12);
        AnimalAB elefante = new Elefante(85, 150, 12);
        AnimalAB leao = new Leao(150, 300, 24);*/

        AnimalTerrestreAB cachorro = new Cachorro();
        AnimalTerrestreAB gato = new Gato();
        AnimalTerrestreAB elefante = new Elefante();
        AnimalTerrestreAB leao = new Leao();
        AnimalMarinhoAB peixe = new Peixe();
        AnimalVoadorAB pombo = new Pombo();

        // Definindo atributos através dos métodos
        cachorro.comer(10);
        cachorro.comer(10);
        cachorro.andar(20);
        cachorro.dormir(8);

        gato.comer(5);
        gato.comer(5);
        gato.andar(10);
        gato.dormir(12);

        elefante.comer(10);
        elefante.andar(100);
        elefante.dormir(10);

        leao.comer(15);
        leao.andar(60);
        leao.dormir(15);

       peixe.comer(25);
       peixe.nadar(10);
       peixe.dormir(12);

       pombo.comer(20);
       pombo.voar(40);
       pombo.dormir(4);

    }
}
