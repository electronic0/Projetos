import java.util.Scanner;
import java.util.HashSet;

import Propriedades.Desenho;
import Propriedades.GeradordePalavra;

public class JogodaForca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashSet<Character> letrasDigitadas = new HashSet<>();
        GeradordePalavra gerador = new GeradordePalavra();
        Desenho desenho = new Desenho();
        
        String palavra = gerador.palavraAleatoria();
        char [] palavraEscolhida = new char[palavra.length()];

        boolean palavraAdivinhado = false;
        int erros = 0;
        char letra;

        for (int i = 0; i < palavra.length(); i++) {
            palavraEscolhida[i] = '_';
        }

        System.out.println("Seja bem-vindo(a) ao Jogo da Forca");
        System.out.printf("Tenta advinhar uma palavra de %d letras abaixo.\n", palavra.length());
        System.out.println("Você tem apenas 6 tentativas. Boa sorte");

        System.out.println();

        System.out.println(desenho.desenharForca(erros));

        while (erros < 6 && !palavraAdivinhado) {
            boolean letraCerta = false;

            System.out.println("Palavra: " + String.valueOf(palavraEscolhida));
            System.out.print("Digite uma letra: ");
            letra = entrada.next().charAt(0);

            if (!letrasDigitadas.add(letra)) {
                System.out.println();
                System.out.println("Você já digitou essa letra. Tente novamente com outra letra.");
                System.out.println();

                continue;
            }

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    palavraEscolhida[i] = letra;
                    letraCerta = true;
                }
            }

            if (!letraCerta) {
                erros++;
            }

            palavraAdivinhado = true;

            for (char caractere: palavraEscolhida) {
                if (caractere == '_') {
                    palavraAdivinhado = false;
                    break;
                }
            }

            System.out.println(desenho.desenharForca(erros));
        }

        if (palavraAdivinhado) {
            System.out.println("Parabens! Você adivinhou a palavra " + palavra);
        } else {
            System.out.println("Que pena, acabou as tentativas.");
            System.out.println("A palavra era " + palavra);
        }

        entrada.close();
    }
}