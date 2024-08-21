package ListaDeExercicios04;

public class Pombo extends AnimalVoadorAB {
    @Override
    public void voar(int distancia) {
        setCaminhoPercorrido(distancia);
        System.out.println("O pombo voou " + getCaminhoPercorrido() + " metros.");
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida(quantidade);
        System.out.println("O pombo comeu " + getQtdComida() + " gramas de comida.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(horas);
        System.out.println("O pombo dormiu por " + getHorasAoDormir() + " horas.");
    }
}
