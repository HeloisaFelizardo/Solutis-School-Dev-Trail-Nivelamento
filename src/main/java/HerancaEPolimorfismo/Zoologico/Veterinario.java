package HerancaEPolimorfismo.Zoologico;

public class Veterinario{
    public void examinar(Animal animal){
        System.out.println("O " + animal.getNome() + " foi examinado.");
        animal.emitirSom();
    }
}
