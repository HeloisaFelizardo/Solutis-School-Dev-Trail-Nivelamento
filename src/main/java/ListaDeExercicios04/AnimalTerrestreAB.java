package ListaDeExercicios04;

public abstract class AnimalTerrestreAB extends AnimalAB{
    int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public abstract void andar(int distancia);

    @Override
    public void mover(int distancia) {
        andar(distancia);
    }
}
