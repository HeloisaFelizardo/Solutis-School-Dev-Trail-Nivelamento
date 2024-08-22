package ListaDeExercicios04;

public abstract class AnimalMarinhoAB extends AnimalAB {

    int profundidadeMaxima;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int profundidadeMaxima) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public int getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public abstract void nadar(int distancia);

    @Override
    public void mover(int distancia) {
        nadar(distancia);
    }
}
