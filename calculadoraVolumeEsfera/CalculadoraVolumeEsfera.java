package calculadoraVolumeEsfera;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
    Crie um programa que solicite ao usuário o valor
    do raio de uma esfera e calcule e exiba o seu volume.
*/

public class CalculadoraVolumeEsfera {
    private static final double COEF_NUMERADOR = 4.0;
    private static final double COEF_DENOMINADOR = 3.0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double raio;
        do {
            raio = solicitarValor("Digite o valor do raio da esfera: ", entrada);
            if (raio < 0) {
                System.out.println("Valor invalido. O raio do objeto deve ser positivo.");
            }
        } while (raio < 0);

        double volume = calcularVolume(raio);

        imprimirResultados(volume);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = entrada.nextDouble();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero valido.");
                entrada.next();
            }
        }
    }

    public static double calcularVolume(double raio) {
        return (COEF_NUMERADOR / COEF_DENOMINADOR) * Math.PI * Math.pow(raio, 3); 
    }

    public static void imprimirResultados(double volume) {
        System.out.println("O volume da esfera e: " + formatarNumero(volume));
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}