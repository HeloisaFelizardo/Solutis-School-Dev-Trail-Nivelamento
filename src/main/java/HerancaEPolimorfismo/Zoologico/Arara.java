package HerancaEPolimorfismo.Zoologico;

public class Arara extends Animal{
    public Arara(String nome, int idade) {
        super(nome, idade);
    }

    public void voar(){
        System.out.println("A " + getNome() + " voou.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A " + getNome() + " emitiu um som.");
    }
}
