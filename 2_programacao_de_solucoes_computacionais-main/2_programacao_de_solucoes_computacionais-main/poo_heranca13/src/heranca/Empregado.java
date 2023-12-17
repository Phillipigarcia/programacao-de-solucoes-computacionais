package heranca;

	class Empregado extends Pessoa {
	    private int numeroSecao;
	    private double salarioBase;
	    private double inss;

	    public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss) {
	        super(nome, idade, altura, peso);
	        this.numeroSecao = numeroSecao;
	        this.salarioBase = salarioBase;
	        this.inss = inss;
	    }

	    public int getNumeroSecao() {
	        return numeroSecao;
	    }

	    public double getSalarioBase() {
	        return salarioBase;
	    }

	    public double getInss() {
	        return inss;
	    }

	    public void setNumeroSecao(int numeroSecao) {
	        this.numeroSecao = numeroSecao;
	    }

	    public void setSalarioBase(double salarioBase) {
	        this.salarioBase = salarioBase;
	    }

	    public void setInss(double inss) {
	        this.inss = inss;
	    }

	    public double calcularSalario() {
	        double descontoInss = salarioBase * (inss / 100);
	        return salarioBase - descontoInss;
	    }
	}
