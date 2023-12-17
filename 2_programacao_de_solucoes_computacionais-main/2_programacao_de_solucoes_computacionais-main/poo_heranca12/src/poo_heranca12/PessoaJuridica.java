package poo_heranca12;

class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void imprimirDetalhes() {
        System.out.println("Pessoa Jurídica - Nome: " + getNome() + " - CNPJ: " + getCNPJ());
    }
}
