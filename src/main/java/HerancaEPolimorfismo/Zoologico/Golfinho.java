package HerancaEPolimorfismo.Zoologico;

public class Golfinho extends Animal{
    public Golfinho(String nome, int idade) {
        super(nome, idade);
    }

    public void nadar(){
        System.out.println("O " + getNome() + " nadou.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " emitiu um som.");
    }
}
