package contarEspacosV1;

import java.util.Scanner;

/*
    Faça um programa que receba uma frase e exiba a
    quantidade de espaços em branco presentes na mesma.
*/

public class ContarEspacosV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase = solicitarValor("Digite uma frase: ", entrada);

        quantidadeEspaco(frase);

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String frase;
        while (true) {
            System.out.print(mensagem);
            frase = entrada.nextLine().trim();
            if (frase.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um frase valida.");
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

    public static void quantidadeEspaco(String frase) {
        int contador = 0;
        // Percorre cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            // Verifica se o caractere atual é um espaço em branco
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("Quantidade de espacos em branco: " + contador);
    }
}
