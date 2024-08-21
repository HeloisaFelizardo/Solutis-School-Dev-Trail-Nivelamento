package ListaDeExercicios04;

public abstract class AnimalAB implements AnimalIF {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private int qtdComida;
    private int caminhoPercorrido;
    private int horasAoDormir;

    public AnimalAB() {
        this.qtdComida = 0;
        this.caminhoPercorrido = 0;
        this.horasAoDormir = 0;
    }

    // Métodos para alterar o estado do objeto
    public void setQtdComida(int qtdComida) {
        this.qtdComida = qtdComida;
    }

    public void setCaminhoPercorrido(int caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public void setHorasAoDormir(int horasAoDormir) {
        this.horasAoDormir = horasAoDormir;
    }

    public int getQtdComida() {
        return qtdComida;
    }

    public int getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public int getHorasAoDormir() {
        return horasAoDormir;
    }

    @Override
    public abstract void comer(int quantidade);

    @Override
    public abstract void mover(int distancia);

    @Override
    public abstract void dormir(int horas);
}
