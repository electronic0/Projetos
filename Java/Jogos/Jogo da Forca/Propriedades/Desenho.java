package Propriedades;

public class Desenho {
    public String desenharForca(int erros) {
        return switch (erros) {
			case 0 -> """
					------
					|    |
					|
					|
					|
					|
					--------
					""";

			case 1 -> """
					------
					|    |
					|    O
					|
					|
					|
					--------
					""";

			case 2 -> """
					------
					|    |
					|    O
					|    |
					|
					|
					--------
					""";

			case 3 -> """
					------
					|    |
					|    O
					|   /|
					|
					|
					--------
					""";

			case 4 -> """
					------
					|    |
					|    O
					|   /|\\
					|
					|
					--------
					""";

			case 5 -> """
					------
					|    |
					|    O
					|   /|\\
					|   /
					|
					--------
					""";

			case 6 -> """
					------
					|    |
					|    O
					|   /|\\
					|   / \\
					|
					--------
					""";
			
			default -> "Erro";
		};
    }
}
