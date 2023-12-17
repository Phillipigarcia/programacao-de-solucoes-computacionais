package pesquisa_sequencial_e_binaria;

import java.util.Scanner;

public class PesquisaSequencial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("Digite o número a ser pesquisado:");
            int numeroPesquisado = scanner.nextInt();

            System.out.println("Escolha o algoritmo de busca (1 para Sequencial, 2 para Sequencial com Sentinela):");
            int escolha = scanner.nextInt();

            int comparacoes = 0;
            boolean encontrado = false;

            if (escolha == 1) {
                for (int i = 0; i < 10; i++) {
                    comparacoes++;
                    if (vetor[i] == numeroPesquisado) {
                        encontrado = true;
                        break;
                    }
                }
            } else if (escolha == 2) {
                vetor[10] = numeroPesquisado; // Sentinela
                int i = 0;
                while (vetor[i] != numeroPesquisado) {
                    comparacoes++;
                    i++;
                }
                if (i < 10) {
                    encontrado = true;
                }
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            if (encontrado) {
                System.out.println("Número encontrado! Comparações realizadas: " + comparacoes);
            } else {
                System.out.println("Número não encontrado! Comparações realizadas: " + comparacoes);
            }

            System.out.println("Deseja realizar outra pesquisa? (Digite 's' para sim ou 'n' para não)");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}