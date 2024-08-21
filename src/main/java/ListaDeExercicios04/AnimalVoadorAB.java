package ListaDeExercicios04;

public abstract class AnimalVoadorAB extends AnimalAB {
    public abstract void voar(int distancia);

    @Override
    public void mover(int distancia) {
        voar(distancia);
    }
}
