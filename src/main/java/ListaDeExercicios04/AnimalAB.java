package ListaDeExercicios04;

public abstract class AnimalAB implements AnimalIF {

    private String nome;
    private String tipoAnimal;
    private String habitat;
    private int idade;
    private double altura;
    private double peso;
    private int qtdComida;
    private int caminhoPercorrido;
    private int horasAoDormir;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    public AnimalAB() {
        this.qtdComida = 0;
        this.caminhoPercorrido = 0;
        this.horasAoDormir = 0;
    }

    // Métodos para alterar o estado do objeto
    public String getNome() {
        return nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

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


