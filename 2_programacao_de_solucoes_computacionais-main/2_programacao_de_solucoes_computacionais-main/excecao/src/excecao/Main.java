package excecao;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite um numero: ");
	        int num = input.nextInt();
	        
	        System.out.print("Digite o divisor: ");
	        int divisor = input.nextInt();
	        
	        try {
	            int resultado = Atividade2.dividir(num, divisor);
	            System.out.println("O resultado da divisão é: " + resultado);
	        } catch (ArithmeticException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	        
	        input.close();
	    }
}
