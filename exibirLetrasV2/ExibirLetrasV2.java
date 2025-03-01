package exibirLetrasV2;

import java.util.Scanner;

/*
    Faça um programa que receba uma palavra e exiba cada 
    letra separadamente (necessita de laço de repetição).
*/

public class ExibirLetrasV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra = solicitarValor("Digite uma palavra: ", entrada);

        percorrerExibirLetras(palavra);

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
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void percorrerExibirLetras(String palavra) {
        // Percorre e exibe as letras separadas por espaço
        System.out.print("Letras separadas: ");
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i)); // Exibe a letra
            if (i < palavra.length() - 1) {
                System.out.print(" "); // Adiciona um espaço entre as letras
            }
        }
        System.out.println(); // Quebra linha após exibir todas as letras
    }
}
