package contarEspacosV2;

import java.util.Scanner;

/*
    Faça um programa que receba uma frase e exiba a
    quantidade de espaços em branco presentes na mesma.
*/

public class ContarEspacosV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase = solicitarValor("Digite uma frase: ", entrada);

        // Divide a frase em partes separadas pelos espaços em branco
        String[] partes = separarFrase(frase);

        quantidadeEspaco(partes);

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

    /*
     * Este método tem a função de dividir a frase em partes
     * Exemplo: Se a entrada for "java e legal", o método separarFrase vai retornar
     * o seguinte array: ["java", "e", "legal"].
     */
    public static String[] separarFrase(String frase) {
        return frase.split("\\s+");
    }

    /*
     * Este método tem a função de contar o número de espaços na frase
     * Exemplo: Se a entrada for o array ["java", "e", "legal"], o método
     * quantidadeEspaco irá calcular que há 2 espaços.
     */
    public static void quantidadeEspaco(String[] partes) {
        // A quantidade de espaços será o número de palavras menos 1
        int espacos = partes.length - 1;
        System.out.println("Quantidade de espacos em branco: " + espacos);
    }
}
