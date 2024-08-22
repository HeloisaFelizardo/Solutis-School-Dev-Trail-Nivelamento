package ListaDeExercicios04;

public abstract class AnimalVoadorAB extends AnimalAB {
    int quantidadeAsas;
    double envergaduraAsas;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, double envergaduraAsas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAsas = 2;
        this.envergaduraAsas = envergaduraAsas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }
    public abstract void voar(int distancia);

    @Override
    public void mover(int distancia) {
        voar(distancia);
    }
}
