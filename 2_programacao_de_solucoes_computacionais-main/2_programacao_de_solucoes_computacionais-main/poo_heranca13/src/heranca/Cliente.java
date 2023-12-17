package heranca;


class Cliente extends Pessoa {
    private double credMax;
    private double valorEmDivida;

    public Cliente(String nome, int idade, double altura, double peso, double credMax, double valorEmDivida) {
        super(nome, idade, altura, peso);
        this.credMax = credMax;
        this.valorEmDivida = valorEmDivida;
    }

    public double getCredMax() {
        return credMax;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setCredMax(double credMax) {
        this.credMax = credMax;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public double obterSaldo() {
        return credMax - valorEmDivida;
    }
}

