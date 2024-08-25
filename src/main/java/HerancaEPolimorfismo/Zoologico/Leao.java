package HerancaEPolimorfismo.Zoologico;

public class Leao extends Animal implements PoderCorrer{
    public Leao(String nome, int idade) {
        super(nome, idade);
    }
    public void correr(){
        System.out.println("O " + getNome() + " correu.");
    }
    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " rosnou.");
    }
}
