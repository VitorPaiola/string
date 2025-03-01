package concatenarPalavras;

import java.util.Scanner;

public class ConcatenarPalavras {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] palavras = new String[TAM_LISTA];

        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
        }

        imprimirResultados(palavras);

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String palavra;
        while (true) {
            System.out.print(mensagem);
            palavra = entrada.nextLine().trim();

            if (validarEntrada(palavra)) {
                return palavra;
            } else {
                System.out.println("Entrada invalida. Digite apenas letras, sem numeros ou caracteres especiais.");
            }
        }
    }

    public static boolean validarEntrada(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            // Verifica se o caractere é uma letra ou um espaço
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false; // Se não for letra nem espaço, retorna falso
            }
        }
        return true; // Se todos os caracteres forem válidos, retorna verdadeiro
    }

    public static void imprimirResultados(String[] palavras) {
        System.out.println("Palavras concatenadas: " + String.join(" ", palavras));
    }
}
