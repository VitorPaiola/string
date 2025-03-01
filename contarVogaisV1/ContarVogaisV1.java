package contarVogaisV1;

import java.util.Scanner;

/*
 * Crie um programa que leia uma palavra e exiba 
 * a quantidade de vogais presentes na mesma.
*/

public class ContarVogaisV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra = solicitarValor("Digite uma palavra: ", entrada);

        // Percorre a palavra e conta as vogais
        int qtdVogais = percorrerVerificarCaracteres(palavra);

        // Exibir o resultado
        imprimirResultados(qtdVogais);

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

    public static int percorrerVerificarCaracteres(String palavra) {
        int contadorVogais = 0;

        // Percorre cada caractere da palavra
        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));

            // Verifica se a letra é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
        }
        return contadorVogais;
    }

    public static void imprimirResultados(int qtdVogais) {
        System.out.println("Quantidade de vogais: " + qtdVogais);
    }
}
