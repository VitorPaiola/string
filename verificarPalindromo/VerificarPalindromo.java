package verificarPalindromo;

import java.util.Scanner;

/*
    Faça um programa que leia uma palavra e
    verifique se a mesma é palíndromo (se pode ser
    lida da mesma forma de trás para frente).
*/

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase = solicitarValor("Digite uma frase: ", entrada);

        String fraseFormatada = formatarFrase(frase);

        imprimirResultados(verificarPalindromo(fraseFormatada));

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String frase;
        while (true) {
            System.out.print(mensagem);
            frase = entrada.nextLine().trim();
            if (frase.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite uma frase valida.");
            } else if (validarEntrada(frase)) {
                return frase;
            } else {
                System.out.println("Entrada invalida. Digite apenas letras, sem numeros ou caracteres especiais.");
            }
        }
    }

    public static boolean validarEntrada(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    public static String formatarFrase(String frase) {
        // Removemos os espaços em brancos e convertemos para letras minúsculas
        return frase.replaceAll("\\s+", "").toLowerCase();
    }

    public static boolean verificarPalindromo(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            char caracterInicial = frase.charAt(i);
            char caracterFinal = frase.charAt(frase.length() - i - 1);
            if (caracterInicial != caracterFinal) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirResultados(boolean palindromo) {
        if (palindromo) {
            System.out.println("A palavra e um palindromo.");
        } else {
            System.out.println("A palavra nao e um palindromo.");
        }
    }
}
