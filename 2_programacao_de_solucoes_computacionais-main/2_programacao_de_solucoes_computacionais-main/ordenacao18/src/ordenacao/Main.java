package ordenacao;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Bolha");
            System.out.println("2. Seleção");
            System.out.println("3. Inserção");
            System.out.println("4. Quicksort");
            System.out.println("0. Sair");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            int[] array = new int[10];

            System.out.println("Informe 10 números para serem ordenados:");

            for (int i = 0; i < 10; i++) {
                array[i] = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    Sorting.bubbleSort(array);
                    break;
                case 2:
                    Sorting.selectionSort(array);
                    break;
                case 3:
                    Sorting.insertionSort(array);
                    break;
                case 4:
                    Sorting.quickSort(array, 0, array.length - 1);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Array ordenado: " + Arrays.toString(array));

            System.out.println("Deseja executar novamente? (1 para Sim, 0 para Não)");
        } while (scanner.nextInt() == 1);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}