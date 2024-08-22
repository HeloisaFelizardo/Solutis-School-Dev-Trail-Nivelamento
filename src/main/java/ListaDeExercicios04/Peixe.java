package ListaDeExercicios04;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String habitat, double altura, double peso, int profundidadeMaxima) {
        super(nome, "Peixe", idade, habitat, altura, peso, profundidadeMaxima);
    }
    @Override
    public void nadar(int distancia) {
        setCaminhoPercorrido(getCaminhoPercorrido() + distancia);
        System.out.println("O peixe nadou " + distancia + " metros.");
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida(getQtdComida() + quantidade);
        System.out.println("O peixe comeu " + quantidade + " gramas de comida.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(getHorasAoDormir() + horas);
        System.out.println("O peixe dormiu por " + horas + " horas.");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "nome='" + getNome() + '\'' +
                ", tipoAnimal='" + getTipoAnimal() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                ", idade=" + getIdade() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", profundidade maxima=" + getProfundidadeMaxima() +
                ", quantidade de comida=" + getQtdComida() +
                ", caminho percorrido=" + getCaminhoPercorrido() +
                ", horasAoDormir=" + getHorasAoDormir() +
                '}';
    }
}
