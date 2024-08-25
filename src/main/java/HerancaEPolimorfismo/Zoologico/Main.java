package HerancaEPolimorfismo;

public class Main {
    public static void main(String[] args) {


        Animal cachorro = new Cachorro("Cachorro", 2);
        cachorro.emitirSom();
        Animal cavalo = new Cavalo("Cavalo", 5);
        cavalo.emitirSom();
        Animal preguica = new Preguica("Preguiça", 3);
        preguica.emitirSom();

        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAnimal(cachorro);
        zoologico.adicionarAnimal(cavalo);
        zoologico.adicionarAnimal(preguica);

        System.out.println("Processando animais no zoológico:");
        zoologico.processarAnimais();
    }
}
