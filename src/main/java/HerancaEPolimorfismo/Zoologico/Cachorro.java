package HerancaEPolimorfismo;

public class Cachorro extends Animal implements PoderCorrer{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    public void correr(){
        System.out.println("O " + getNome() + " correu.");
    }
    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " latiu.");
    }
}
