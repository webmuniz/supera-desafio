package desafio1;

import java.util.*;

public class Desafio1 {
    public static void main(String[] args) {
        System.out.println("Digite quantos números deseja inserir: ");
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println("Digite os números: ");
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            numeros.add(valor);
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        System.out.println("--- PARES em ordem crescente --- ");
        for (int numero : pares) {
            System.out.println(numero);
        }

        System.out.println("--- IMPARES em ordem crescente --- ");
        for (int numero : impares) {
            System.out.println(numero);
        }
    }
}
