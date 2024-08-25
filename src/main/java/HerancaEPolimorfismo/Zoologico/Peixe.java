package HerancaEPolimorfismo.Zoologico;

public class Peixe extends Animal{
    public Peixe(String nome, int idade) {
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
