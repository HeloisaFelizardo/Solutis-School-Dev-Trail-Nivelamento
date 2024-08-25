package HerancaEPolimorfismo.Zoologico;

public class Foca extends Animal{
    public Foca(String nome, int idade) {
        super(nome, idade);
    }

    public void nadar(){
        System.out.println("A " + getNome() + " nadou.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A " + getNome() + " emitiu um som.");
    }
}
