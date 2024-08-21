package ListaDeExercicios04;

public class Leao extends AnimalTerrestreAB {

    @Override
    public void comer(int quantidade) {
        setQtdComida(quantidade);
        System.out.println("O leão comeu " + getQtdComida() + " kg de carne.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(distancia);
        System.out.println("O leão andou " + getCaminhoPercorrido() + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(horas);
        System.out.println("O leão dormiu por " + getHorasAoDormir() + " horas.");
    }
}
