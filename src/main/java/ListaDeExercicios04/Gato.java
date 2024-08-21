package ListaDeExercicios04;

public class Gato extends AnimalTerrestreAB {

    @Override
    public void comer(int quantidade) {
        setQtdComida(quantidade);
        System.out.println("O gato comeu " + getQtdComida() + " gramas de ração.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(distancia);
        System.out.println("O gato andou " + getCaminhoPercorrido() + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(horas);
        System.out.println("O gato dormiu por " + getHorasAoDormir() + " horas.");
    }
}
