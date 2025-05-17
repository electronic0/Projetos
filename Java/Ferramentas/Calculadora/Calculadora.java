import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2;
        double resultado = 0;
        char operador;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = entrada.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextDouble();

        entrada.close();

        switch (operador) {
            case '+': {
                resultado = numero1 + numero2;
                break;
            }

            case '-': {
                resultado = numero1 - numero2;
                break;
            }

            case '*': {
                resultado = numero1 * numero2;
                break;
            }

            case '/': {
                if (numero2 == 0) {
                    System.out.println("Não é possivel realizar divisão por zero");
                    return;
                }

                resultado = numero1 / numero2;
                break;
            }

            default: {
                System.out.println("Operador invalido. Tente novamente.");
            }
        }

        System.out.println("Resultado: " + resultado);
    }
}
