package excecao;

public class Atividade2 {
	  public static int dividir(int num, int divisor) throws ArithmeticException {
	        if (divisor == 0) {
	            throw new ArithmeticException("Divisão por zero não é permitida.");
	        }
	        if (num < 0) {
	            throw new ArithmeticException("O dividendo deve ser maior ou igual a 0.");
	        }
	        return num / divisor;
	    }
}
