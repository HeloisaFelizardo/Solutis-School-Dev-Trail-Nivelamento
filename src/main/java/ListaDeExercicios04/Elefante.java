package ListaDeExercicios04;

public class Elefante extends AnimalTerrestreAB {

    @Override
    public void comer(int quantidade) {
        setQtdComida(quantidade);
        System.out.println("O elefante comeu " + getQtdComida() + " kg de comida.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(distancia);
        System.out.println("O elefante andou " + getCaminhoPercorrido() + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(horas);
        System.out.println("O elefante dormiu por " + getHorasAoDormir() + " horas.");
    }
}
