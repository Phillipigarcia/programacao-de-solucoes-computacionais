package pesquisa_sequencial_e_binaria;

import java.util.Arrays;
import java.util.Scanner;

public class UniaoConjuntos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

     
        System.out.println("Digite 10 números para o conjunto A:");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 números para o conjunto B:");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = scanner.nextInt();
        }

        
        Arrays.sort(vetorA);
        Arrays.sort(vetorB);

      
        int[] conjuntoA = removerDuplicatas(vetorA);
        int[] conjuntoB = removerDuplicatas(vetorB);

       
        int[] conjuntoC = uniao(conjuntoA, conjuntoB);

        
        System.out.println("Conjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
        System.out.println("União (C = A U B): " + Arrays.toString(conjuntoC));

        scanner.close();
    }

    private static int[] removerDuplicatas(int[] vetor) {
        int tamanho = vetor.length;
        int novoTamanho = tamanho;

        for (int i = 0; i < tamanho - 1; i++) {
            if (vetor[i] == vetor[i + 1]) {
                novoTamanho--;
            }
        }

        int[] resultado = new int[novoTamanho];
        int j = 0;

        for (int i = 0; i < tamanho - 1; i++) {
            if (vetor[i] != vetor[i + 1]) {
                resultado[j++] = vetor[i];
            }
        }

        resultado[j] = vetor[tamanho - 1];
        return resultado;
    }

    private static int[] uniao(int[] conjuntoA, int[] conjuntoB) {
        int tamanhoC = conjuntoA.length + conjuntoB.length;
        int[] conjuntoC = new int[tamanhoC];
        int i = 0, j = 0, k = 0;

        while (i < conjuntoA.length && j < conjuntoB.length) {
            if (conjuntoA[i] < conjuntoB[j]) {
                conjuntoC[k++] = conjuntoA[i++];
            } else if (conjuntoA[i] > conjuntoB[j]) {
                conjuntoC[k++] = conjuntoB[j++];
            } else {
               
                conjuntoC[k++] = conjuntoA[i++];
                j++;
            }
        }

        
        while (i < conjuntoA.length) {
            conjuntoC[k++] = conjuntoA[i++];
        }

        
        while (j < conjuntoB.length) {
            conjuntoC[k++] = conjuntoB[j++];
        }

        return Arrays.copyOf(conjuntoC, k); 
    }
}