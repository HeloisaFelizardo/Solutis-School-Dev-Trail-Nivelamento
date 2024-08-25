package HerancaEPolimorfismo.Zoologico;

public class Zebra extends Animal implements PoderCorrer{
    public Zebra(String nome, int idade) {
        super(nome, idade);
    }
    public void correr(){
        System.out.println("A " + getNome() + " correu.");
    }
    @Override
    public void emitirSom() {
        System.out.println("A " + getNome() + " relinchou.");
    }
}
