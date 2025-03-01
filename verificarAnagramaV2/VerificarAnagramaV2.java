package verificarAnagramaV2;

import java.util.Arrays;
import java.util.Scanner;

/*
    Crie um programa que leia duas palavras e verifique
    se a segunda palavra é um anagrama da primeira.
*/

public class VerificarAnagramaV2 {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] palavras = new String[TAM_LISTA];

        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = formatarPalavra(solicitarValor("Digite a " + (i + 1) + " palavra: ", entrada));
        }

        verificarAnagrama(palavras);

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String palavra;
        while (true) {
            System.out.print(mensagem);
            palavra = entrada.nextLine().trim();
            if (palavra.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite uma palavra valida.");
            } else if (validarEntrada(palavra)) {
                return palavra;
            } else {
                System.out.println("Entrada invalida. Digite apenas letras, sem numeros ou caracteres especiais.");
            }
        }
    }

    public static boolean validarEntrada(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    public static String formatarPalavra(String palavra) {
        // Remove espaços em branco e converte para minúsculas
        return palavra.replaceAll("\\s+", "").toLowerCase();
    }

    public static void verificarAnagrama(String[] palavras) {
        // Verifica se as duas palavras têm o mesmo tamanho
        if (palavras[0].length() != palavras[1].length()) {
            System.out.println("A segunda palavra nao e um anagrama da primeira.");
        } else {
            // Converte as palavras para arrays de caracteres
            char[] arr1 = palavras[0].toCharArray();
            char[] arr2 = palavras[1].toCharArray();

            // Ordena os arrays de caracteres
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Verifica se os arrays ordenados são iguais
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("A segunda palavra e um anagrama da primeira.");
            } else {
                System.out.println("A segunda palavra nao e um anagrama da primeira.");
            }
        }
    }
}
