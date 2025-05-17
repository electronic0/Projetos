import java.util.Random;
import java.util.Scanner;

public class GeradordeSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        StringBuilder senha;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^*+=-?";

        int quantidadeCaracteres;
        int quantidade;

        System.out.print("Insira o valor de senhas a ser gerado: ");
        quantidade = entrada.nextInt();

        System.out.print("Insira o valor da quantidade de caracteres a ser gerado: ");
        quantidadeCaracteres = entrada.nextInt();

        for (int i = 0; i < quantidade; i++) {
            senha = new StringBuilder();
            for (int j = 0; j < quantidadeCaracteres; j++) {
                senha.append(caracteres.charAt(random.nextInt(0, caracteres.length())));
            }

            System.out.println("Senha " + (i + 1) + ": " + senha.toString());
        }

        entrada.close();
    }
}
