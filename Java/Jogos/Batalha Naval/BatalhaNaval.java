import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {
    static void desenharTabuleiro(char [][] tabuleiro) {
        for (char [] linha: tabuleiro) {
            for (char coluna: linha) {
                System.out.printf(" %c ", coluna);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        char [][] tabuleiro = new char[5][5];

        int linhaInimigo = random.nextInt(0, 5);
        int colunaInimigo = random.nextInt(0, 5);
        int tentativas = 5;

        int linhaUsuario;
        int colunaUsuario;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '~';
            }
        }

        desenharTabuleiro(tabuleiro);

        System.out.println();

        System.out.println("Um navio do inimigo está escondido em algum lugar no tabuleiro acima");
        System.out.println("Informe qual linha e coluna este navio está localizado.");

        System.out.println();

        while (tentativas != 0) {
            System.out.println("Tentativas: " + tentativas);

            while (true) {
                try {
                    System.out.print("Linha: ");
                    linhaUsuario = entrada.nextInt() - 1;

                    System.out.print("Coluna: ");
                    colunaUsuario = entrada.nextInt() - 1;

                    tabuleiro[linhaUsuario][colunaUsuario] = 'X';

                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Linha e(ou) coluna invalido. Tente novamente");
                }
            }

            System.out.println();

            desenharTabuleiro(tabuleiro);

            System.out.println();

            if (linhaUsuario == linhaInimigo && colunaUsuario == colunaInimigo) {
                System.out.println("Parabens! Você achou o navio do inimigo");
                System.out.println();

                break;
            } else {
                System.out.println("O navio do inimigo não está aqui. Tente novamente");
                System.out.println();

                tentativas--;
            }
        }

        tabuleiro[linhaInimigo][colunaInimigo] = 'N';

        if (tentativas == 0) {
            System.out.println("Você perdeu! Não conseguiu achar o navio do inimigo");
            System.out.println();

            desenharTabuleiro(tabuleiro);

            System.out.println();
            System.out.printf("O navio estava presente na %d° linha e na %d° coluna\n", linhaInimigo + 1, colunaInimigo + 1);
        }

        entrada.close();
    }
}
