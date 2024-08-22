package ListaDeExercicios04;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String habitat, double altura, double peso,  double envergaduraAsas) {
        super(nome, "Pombo", idade, habitat, altura, peso, envergaduraAsas);
    }

    @Override
    public void voar(int distancia) {
        setCaminhoPercorrido(getCaminhoPercorrido() + distancia);
        System.out.println("O pombo voou " + distancia + " metros.");
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida(getQtdComida() + quantidade);
        System.out.println("O pombo comeu " + quantidade + " gramas de comida.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(getHorasAoDormir() + horas);
        System.out.println("O pombo dormiu por " + horas + " horas.");
    }


    @Override
    public String toString() {
        return "Pombo{" +
                "nome='" + getNome() + '\'' +
                ", tipoAnimal='" + getTipoAnimal() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                ", idade=" + getIdade() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", quantidade de asas=" + getQuantidadeAsas() +
                ", envergadura asas=" + getEnvergaduraAsas() +
                ", quantidade de comida=" + getQtdComida() +
                ", caminho percorrido=" + getCaminhoPercorrido() +
                ", horasAoDormir=" + getHorasAoDormir() +
                '}';
    }
}
