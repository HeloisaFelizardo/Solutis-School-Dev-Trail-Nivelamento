package ListaDeExercicios04;

public abstract class AnimalMarinhoAB extends AnimalAB {

    private String tipoAnimal;
    private String habitat;

    public abstract void nadar(int distancia);

    @Override
    public void mover(int distancia) {
        nadar(distancia);
    }
}
