package ListaDeExercicios04;

public class Peixe extends AnimalMarinhoAB {
    @Override
    public void nadar(int distancia) {
        setCaminhoPercorrido(distancia);
        System.out.println("O peixe nadou " + getCaminhoPercorrido() + " metros.");
    }

    @Override
    public void comer(int quantidade) {
        setQtdComida(quantidade);
        System.out.println("O peixe comeu " + getQtdComida() + " gramas de comida.");
    }

    @Override
    public void dormir(int horas) {
        setHorasAoDormir(horas);
        System.out.println("O peixe dormiu por " + getHorasAoDormir() + " horas.");
    }
}
