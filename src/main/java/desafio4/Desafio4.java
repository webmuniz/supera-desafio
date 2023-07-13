package desafio4;

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas:");
        int n = scanner.nextInt();

        System.out.println("Digite as linhas:");
        scanner.nextLine();
        for (int i = 0; i < n; i++) {

            String linha = scanner.nextLine();
            int tamanho = linha.length();
            if (i == 0) {
                System.out.println("\n\n ----- CORRIGIDO: ----- \n");
            }
            String metadeEsquerda = linha.substring(0, tamanho / 2);
            String metadeDireita = linha.substring(tamanho / 2, tamanho);

            String decifrada = reverse(metadeEsquerda) + reverse(metadeDireita);
            System.out.println(decifrada);
        }
    }

    private static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

}
