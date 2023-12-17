package pesquisa_sequencial_e_binaria;
import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

       
        System.out.println("Digite 10 números ordenados:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("Digite o número a ser pesquisado:");
            int numeroPesquisado = scanner.nextInt();

            int comparacoes = 0;
            int indice = pesquisaBinaria(vetor, numeroPesquisado, comparacoes);

            if (indice != -1) {
                System.out.println("Número encontrado na posição " + indice + "! Comparações realizadas: " + comparacoes);
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

    private static int pesquisaBinaria(int[] vetor, int numeroPesquisado, int comparacoes) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            comparacoes++;
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == numeroPesquisado) {
                return meio;
            } else if (vetor[meio] < numeroPesquisado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}