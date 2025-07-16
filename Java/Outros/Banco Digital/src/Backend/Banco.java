package Backend;

import java.util.Scanner;

public class Banco {
    private Scanner entrada = new Scanner(System.in);
    private Cores cor = new Cores();
    private String nome, senha, nomeEntrada, senhaEntrada;
    private double valor, saldo;
    private int opcao;

    public Banco() {
        this.nome = "";
        this.senha = "";
        this.saldo = 0;
    }

    public void menu() {
        while (true) {
            System.out.println("Olá " + nome + "!");
            System.out.printf("Saldo: \u001B[32mR$%.2f\u001B[0m\n", saldo);
            System.out.println();
    
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair da conta");
            System.out.println();
    
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            System.out.print("\033\143");

            switch (opcao) {
                case 1: {
                    depositar();
                    break;
                }

                case 2: {
                    sacar();
                    break;
                }

                case 3: {
                    entrada.nextLine();
                    return;
                }

                default: {
                    cor.println("Opção invalida. Tente novamente", "vermelho");
                }
            }
        }
    }

    public void cadastrarConta() {
        System.out.println("Digite um nome e uma senha que contem 9 a 25 digitos");
        System.out.print("Nome: ");
        nomeEntrada = entrada.nextLine();

        while (true) {
            System.out.print("Senha: ");
            senhaEntrada = entrada.nextLine();

            System.out.print("\033\143");
            
            if (senhaEntrada.length() < 9) {
                cor.println("Senha abaixo de 9 digitos. Tente novamente.", "vermelho");
            } else if (senhaEntrada.length() > 25) {
                cor.println("Senha acima de 25 digitos. Tente novamente.", "vermelho");
            } else {
                break;
            }
        }

        nome = nomeEntrada;
        senha = senhaEntrada;

        System.out.print("\033\143");

        cor.println("Usuario cadastrado com sucesso!", "verde");
    }

    public void logarConta() {
        if (!nome.isEmpty() && !senha.isEmpty()) {
            System.out.println("Digite seu nome e sua senha");
            System.out.print("Nome: ");
            nomeEntrada = entrada.nextLine();
    
            System.out.print("Senha: ");
            senhaEntrada = entrada.nextLine();
    
            if (nome.equals(nomeEntrada) && senha.equals(senhaEntrada)) {
                System.out.print("\033\143");
                menu();
            } else {
                System.out.print("\033\143");
                cor.println("Nome ou senha estão incorretos. Tente novamente", "vermelho");
            }

        } else {
            cor.println("Nenhuma conta registrada no sistema.", "vermelho");
        }
    }

    public void depositar() {
        System.out.println("Digite um valor que deseja depositar");
        System.out.print("R$: ");
        valor = entrada.nextDouble();

        if (valor <= 0) {
            System.out.print("\033\143");
            cor.println("Não é possivel depositar um valor abaixo ou igual a 0.", "vermelho");
        } else {
            System.out.print("\033\143");
            saldo += valor;
            cor.println("Valor depositado com sucesso!", "verde");
        }
    }

    public void sacar() {
        System.out.println("Digite um valor que deseja sacar");
        System.out.print("R$: ");
        valor = entrada.nextDouble();

        if (valor > saldo) {
            System.out.print("\033\143");
            cor.println("Não é possivel sacar um valor maior que o saldo", "vermelho");
        } else {
            System.out.print("\033\143");
            saldo -= valor;
            cor.println("Valor sacado com sucesso!", "verde");
        }
    }
}
