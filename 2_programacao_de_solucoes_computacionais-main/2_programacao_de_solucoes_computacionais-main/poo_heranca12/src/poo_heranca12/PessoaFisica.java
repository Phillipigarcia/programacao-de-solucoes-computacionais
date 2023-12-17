package poo_heranca12;

class PessoaFisica extends Pessoa {
    private String CPF;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return this.CPF;
    }
  
        public void imprimirDetalhes() {
            System.out.println("Pessoa Física - Nome: " + getNome() + " - CPF: " + getCPF());
        }
    }
