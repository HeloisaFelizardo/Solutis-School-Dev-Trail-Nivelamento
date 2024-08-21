package ListaDeExercicios04;

public abstract class AnimalTerrestreAB extends AnimalAB{
    public abstract void andar(int distancia);

    @Override
    public void mover(int distancia) {
        andar(distancia);
    }
}
