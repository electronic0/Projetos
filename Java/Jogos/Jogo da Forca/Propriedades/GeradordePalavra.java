package Propriedades;
import java.util.Random;

public class GeradordePalavra {
    private Random random = new Random();
    private String[] listaDePalavras = {
        "banana",
        "maça",
        "livro",
        "blusa",
        "computador",
        "diplomata",
        "montanha",
        "cachorro",
        "viagem",
        "celular",
        "sonho"
    };

    public String palavraAleatoria() {
        return listaDePalavras[random.nextInt(0, listaDePalavras.length)];
    }
}
