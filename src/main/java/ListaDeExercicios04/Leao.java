package ListaDeExercicios04;

public class Leao extends AnimalTerrestreAB {
    public Leao(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Leao", idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida(getQtdComida() + quantidade);
        System.out.println("O leão comeu " + quantidade + " kg de carne.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(getCaminhoPercorrido() + distancia);
        System.out.println("O leão andou " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(getHorasAoDormir() + horas);
        System.out.println("O leão dormiu por " + horas + " horas.");
    }

    @Override
    public String toString() {
        return "Leao{" +
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
