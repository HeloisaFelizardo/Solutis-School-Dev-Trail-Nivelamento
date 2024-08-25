package HerancaEPolimorfismo.Zoologico;

public class Cavalo extends Animal implements PoderCorrer{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    public void correr(){
        System.out.println("O " + getNome() + " correu.");
    }
    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " relinchou.");
    }
}
