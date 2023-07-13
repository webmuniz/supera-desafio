package desafio3;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o tamanho do array:");
        int n = scanner.nextInt();
        System.out.println("Digite o valor alvo:");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite os valores do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        System.out.println("Resultado:");
        System.out.println(count);
    }

}
