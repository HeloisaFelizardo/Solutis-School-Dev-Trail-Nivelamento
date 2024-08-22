package ListaDeExercicios04;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Cachorro", idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida( getQtdComida() + quantidade);
        System.out.println("O cachorro comeu " + quantidade + " kg de ração.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(getCaminhoPercorrido() + distancia);
        System.out.println("O cachorro andou " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(getHorasAoDormir() + horas);
        System.out.println("O cachorro dormiu por " + horas + " horas.");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
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


