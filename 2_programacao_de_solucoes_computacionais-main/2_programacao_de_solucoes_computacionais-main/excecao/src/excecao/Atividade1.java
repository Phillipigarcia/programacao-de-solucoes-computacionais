package excecao;
import java.util.Scanner;
public class Atividade1 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o numero: ");
	        int num = input.nextInt();
	        
	        System.out.print("Digite o divisor: ");
	        int divisor = input.nextInt();
	        
	        try {
	            int resultado = (num/ divisor);
	            System.out.println("O resultado da divisão é: " + resultado);
	       } catch (ArithmeticException e) {
	            System.err.println("Erro de divisão por zero: " + e.getMessage());
	        } catch (Exception e) {
	            System.err.println("Erro: " + e.getMessage());
	        } finally {
	            input.close();
	        }

}
}