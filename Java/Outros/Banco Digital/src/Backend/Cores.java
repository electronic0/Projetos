package Backend;

import java.util.HashMap;

public class Cores {
    private HashMap<String, String> cores = new HashMap<>();
    private String branco = "\u001B[0m";

    public Cores() {
        cores.put("vermelho", "\u001B[31m");
        cores.put("verde", "\u001B[32m");
    }

    public void println(String texto, String cor) {
        System.out.println(cores.get(cor) + texto + branco);
    }
}
