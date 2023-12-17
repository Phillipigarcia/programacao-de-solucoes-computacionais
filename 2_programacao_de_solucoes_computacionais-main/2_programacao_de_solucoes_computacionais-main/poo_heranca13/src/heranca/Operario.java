package heranca;


class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double valorProducao, double comissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * (comissao / 100));
    }
}

