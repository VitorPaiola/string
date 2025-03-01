package substituirLetraV1;

import java.util.Scanner;

/*
    Crie um programa que receba uma frase e
    substitua todas as letras "a" por "e"

    Usando replace
*/

public class SubstituirLetraV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase = solicitarValor("Digite uma frase: ", entrada);

        novaFrase(frase);

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

    public static void novaFrase(String frase) {
        String novaFrase = frase.replace('a', 'e');
        System.out.println("Frase modificada: " + novaFrase);
    }
}
