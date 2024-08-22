package ListaDeExercicios04;

public class Gato extends AnimalTerrestreAB {
    public Gato(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Gato", idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida(getQtdComida() + quantidade);
        System.out.println("O gato comeu " + quantidade + " gramas de ração.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(getCaminhoPercorrido() + distancia);
        System.out.println("O gato andou " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(getHorasAoDormir() + horas);
        System.out.println("O gato dormiu por " + horas + " horas.");
    }

    @Override
    public String toString() {
        return "Gato{" +
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
