package verificarAnagramaV1;

import java.util.Arrays;
import java.util.Scanner;

/*
    Crie um programa que leia duas palavras e verifique
    se a segunda palavra é um anagrama da primeira.
*/

public class VerificarAnagramaV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra1 = formatarPalavra(solicitarValor("Digite a primeira palavra: ", entrada));
        String palavra2 = formatarPalavra(solicitarValor("Digite a segunda palavra: ", entrada));

        verificarTamanho(palavra1, palavra2);

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String palavra;
        while (true) {
            System.out.print(mensagem);
            palavra = entrada.nextLine().trim();
            if (palavra.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um frase valida.");
            } else if (validarEntrada(palavra)) {
                return palavra;
            } else {
                System.out.println("Entrada invalida. Digite uma frase, sem numeros ou caracteres especiais.");
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
        // Removemos os espaços em branco e convertemos para letras minúsculas
        return palavra.replaceAll("\\s+", "").toLowerCase();
    }

    public static void verificarTamanho(String palavra1, String palavra2) {
        // Verificamos se as duas palavras têm o mesmo tamanho
        if (palavra1.length() != palavra2.length()) {
            System.out.println("A segunda palavra nao e um anagrama da primeira.");
        } else {
            // Convertemos as palavras para arrays de caracteres
            char[] arr1 = palavra1.toCharArray();
            char[] arr2 = palavra2.toCharArray();

            // Ordenamos os arrays de caracteres
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Verificamos se os arrays ordenados sao iguais
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("A segunda palavra e um anagrama da primeira.");
            } else {
                System.out.println("A segunda palavra nao e um anagrama da primeira.");
            }
        }
    }
}
