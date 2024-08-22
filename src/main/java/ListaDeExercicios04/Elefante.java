package ListaDeExercicios04;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Terrestre", idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida(getQtdComida() + quantidade);
        System.out.println("O elefante comeu " + quantidade + " kg de comida.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(getCaminhoPercorrido() + distancia);
        System.out.println("O elefante andou " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(getHorasAoDormir() + horas);
        System.out.println("O elefante dormiu por " + horas + " horas.");
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "nome='" + getNome() + '\'' +
                ", tipoAnimal='" + getTipoAnimal() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                ", idade=" + getIdade() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", quantidade de patas=" + getQuantidadePatas() +
                ", quantidade de comida=" + getQtdComida() +
                ", caminho percorrido=" + getCaminhoPercorrido() +
                ", horasAoDormir=" + getHorasAoDormir() +
                '}';
    }
}
