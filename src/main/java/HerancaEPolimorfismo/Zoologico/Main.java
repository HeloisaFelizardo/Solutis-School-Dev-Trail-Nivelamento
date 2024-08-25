package HerancaEPolimorfismo.Zoologico;

public class Main {
    public static void main(String[] args) {


        Animal cachorro = new Cachorro("Cachorro", 2);
        cachorro.emitirSom();
        Animal cavalo = new Cavalo("Cavalo", 5);
        cavalo.emitirSom();
        Animal preguica = new Preguica("Preguiça", 3);
        preguica.emitirSom();
        Animal leao = new Leao("Leão", 6);
        leao.emitirSom();
        Animal zebra = new Zebra("Zebra", 3);
        zebra.emitirSom();
        Animal aguia = new Aguia("Aguia", 10);
        aguia.emitirSom();
        Animal peixe = new Peixe("Peixe", 1);
        peixe.emitirSom();
        Animal arara = new Arara("Arara", 4);
        arara.emitirSom();
        Animal foca = new Foca("Foca", 2);
        foca.emitirSom();
        Animal golfinho = new Golfinho("Golfinho", 3);
        golfinho.emitirSom();

        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAnimal(cachorro);
        zoologico.adicionarAnimal(cavalo);
        zoologico.adicionarAnimal(preguica);
        zoologico.adicionarAnimal(leao);
        zoologico.adicionarAnimal(zebra);
        zoologico.adicionarAnimal(aguia);
        zoologico.adicionarAnimal(peixe);
        zoologico.adicionarAnimal(arara);
        zoologico.adicionarAnimal(foca);
        zoologico.adicionarAnimal(golfinho);

        System.out.println("Processando animais no zoológico:");
        zoologico.processarAnimais();
    }
}
