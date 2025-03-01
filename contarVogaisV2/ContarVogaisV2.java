package contarVogaisV2;

import java.util.Scanner;

/*
 * Crie um programa que leia uma palavra e exiba 
 * a quantidade de vogais presentes na mesma.
*/

public class ContarVogaisV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Chama o método para ler um número inteiro positivo
        int n = letInteiroPositivo(entrada);

        // Cria o array de palavras
        String[] palavras = new String[n];

        // Solicita cada palavra
        for (int i = 0; i < n; i++) {
            palavras[i] = solicitarValor("Digite a palavra " + (i + 1) + ": ", entrada);
        }

        System.out.println();

        // Para cada palavra, contar as vogais e imprimir o resultado
        for (String palavra : palavras) {
            int qtdVogais = percorrerVerificarCaracter(palavra);
            imprimirResultados(palavra, qtdVogais);
        }

        entrada.close();
    }

    public static int letInteiroPositivo(Scanner entrada) {
        int numero = 0;
        boolean entradaValida = false;

        // Loop até que uma entrada válida seja fornecida
        while (!entradaValida) {
            try {
                System.out.print("Quantas palavras voce quer inserir? ");
                numero = entrada.nextInt();
                entrada.nextLine(); // Consome o newline deixado pelo nextInt()

                // Verifica se o número é positivo
                if (numero > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Por favor, insira um numero maior que zero.");
                }
            } catch (Exception e) {
                // Caso o usuário insira algo não numérico
                System.out.println("Por favor, insira um numero maior que zero.");
                entrada.nextLine();
            }
        }
        return numero;
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String palavra;
        while (true) {
            System.err.print(mensagem);
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

    public static int percorrerVerificarCaracter(String palavra) {
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

    public static void imprimirResultados(String palavra, int qtdVogais) {
        System.out.println("Palavra: " + palavra + " | Quantidade de vogais: " + qtdVogais);
    }
}
