import java.util.Scanner;
import Backend.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Banco banco = new Banco();
        Cores cor = new Cores();

        int opcao;

        while (true) {
            System.out.println("Seja bem-vindo(a) ao Banco digital");
            System.out.println("Escolhe uma das opções abaixo");
            System.out.println();

            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Login na conta");
            System.out.println("3 - Sair");
            System.out.println();
            
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            System.out.print("\033\143");

            switch (opcao) {
                case 1: {
                    banco.cadastrarConta();
                    break;
                }

                case 2: {
                    banco.logarConta();
                    break;
                }

                case 3: {
                    System.out.print("\033\143");
                    System.out.println("Volte sempre!");
                    entrada.close();
                    return;
                }

                default: {
                    cor.println("Opção invalida. Tente novamente", "vermelho");
                }
            }
        }
    }
}