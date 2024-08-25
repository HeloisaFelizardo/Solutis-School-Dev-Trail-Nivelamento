package HerancaEPolimorfismo.Zoologico;

public class Aguia extends Animal{
    public Aguia(String nome, int idade) {
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
