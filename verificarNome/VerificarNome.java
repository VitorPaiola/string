package verificarNome;

import java.util.Scanner;

/*
    Escreva um programa que receba um nome
    e verifique se o mesmo começa com a letra "A".
*/

public class VerificarNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letraInicial = 'a';

        String nome = solicitarValor("Digite um nome: ", entrada);

        String nomeMinusculo = nome.toLowerCase();

        imprimirResultados(nomeMinusculo, letraInicial);

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String nome;
        while (true) {
            System.out.print(mensagem);
            nome = entrada.nextLine().trim();
            if (nome.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um nome valido.");
            } else if (validarEntrada(nome)) {
                return nome;
            } else {
                System.out.println("Entrada invalida. Digite apenas letras, sem numeros ou caracteres especiais.");
            }
        }
    }

    public static boolean validarEntrada(String nome) {
        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirResultados(String nome, char letraInicial) {
        if (nome.startsWith(String.valueOf(letraInicial))) {
            System.out.println("O nome comeca com a letra '" + Character.toUpperCase(letraInicial) + "'.");
        } else {
            System.out.println("O nome Nao comeca com a letra: '" + Character.toUpperCase(letraInicial) + "'.");
        }
    }
}
