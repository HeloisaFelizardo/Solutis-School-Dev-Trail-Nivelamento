package ListaDeExercicios04;

public class Cachorro extends AnimalTerrestreAB {

    @Override
    public void comer(int quantidade) {
        setQtdComida(quantidade);
        System.out.println("O cachorro comeu " + getQtdComida() + " kg de ração.");
    }

    @Override
    public void andar(int distancia) {
        setCaminhoPercorrido(distancia);
        System.out.println("O cachorro andou " + getCaminhoPercorrido() + " metros.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(horas);
        System.out.println("O cachorro dormiu por " + getHorasAoDormir() + " horas.");
    }
}


