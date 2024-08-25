package HerancaEPolimorfismo.Zoologico;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subirEmArvores(){
        System.out.println("O " + getNome() + " subiu em uma arvore.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A " + getNome() + " fez um som preguiçoso.");
    }
}
