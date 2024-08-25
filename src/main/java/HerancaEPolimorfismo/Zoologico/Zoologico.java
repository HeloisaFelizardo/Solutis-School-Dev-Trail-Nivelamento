package HerancaEPolimorfismo.Zoologico;

public class Zoologico {
    final private Animal[] animais;
    private int count;

    public Zoologico() {
        animais = new Animal[10];
        count = 0;
    }

    public void adicionarAnimal(Animal animal) {
        if (count < animais.length) {
            animais[count] = animal;
            count++;
        } else {
            System.out.println("O zoológico está cheio! Não é possível adicionar mais animais.");
        }
    }

    public void processarAnimais() {
        for (int i = 0; i < count; i++) {
            Animal animal = animais[i];
            animal.emitirSom();

            if (animal instanceof PoderCorrer) {
                ((PoderCorrer) animal).correr();
            }
        }
    }
}
