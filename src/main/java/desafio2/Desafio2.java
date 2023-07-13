package desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        System.out.println("Digite o valor: ");
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int valorInteiro = (int) valor;
        int valorDecimal = (int) ((valor - valorInteiro) * 100);

        System.out.println("NOTAS:");

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidadeNotas = valorInteiro / nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
            valorInteiro %= nota;
        }

        System.out.println("MOEDAS:");

        int[] moedas = {100, 50, 25, 10, 5, 1};

        for (int moeda : moedas) {
            int quantidadeMoedas = valorDecimal / moeda;
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + moeda / 100.0);
            valorDecimal %= moeda;
        }
    }

}
