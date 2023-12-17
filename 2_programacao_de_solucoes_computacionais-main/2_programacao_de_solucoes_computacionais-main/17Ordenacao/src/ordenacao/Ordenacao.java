package ordenacao;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {
    // Método de ordenação - Bolha
    public static void ordenarBolha(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        do {
            trocou = false;

            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;

                    trocou = true;
                }
            }

        } while (trocou);
    }

    // Método de ordenação - Seleção
    public static void ordenarSelecao(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Troca os elementos
            int temp = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = temp;
        }
    }

    // Método de ordenação - Inserção
    public static void ordenarInsercao(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            // Move os elementos do vetor[0..i-1] que são maiores que a chave
            // para uma posição à frente de sua posição atual
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nEscolha o método de ordenação:");
            System.out.println("1. Bolha");
            System.out.println("2. Seleção");
            System.out.println("3. Inserção");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out.println("Informe um vetor de 10 números:");

            int[] vetor = new int[10];
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (escolha) {
                case 1:
                    ordenarBolha(vetor);
                    break;
                case 2:
                    ordenarSelecao(vetor);
                    break;
                case 3:
                    ordenarInsercao(vetor);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

            System.out.println("\nDeseja executar novamente? (1 - Sim, 0 - Não):");
        } while (scanner.nextInt() == 1);

        scanner.close();
    }
}

