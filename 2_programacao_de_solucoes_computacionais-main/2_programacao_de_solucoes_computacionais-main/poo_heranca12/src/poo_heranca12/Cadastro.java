package poo_heranca12;

class Cadastro {
    private Pessoa[] pessoas;
    private int contador;

    public Cadastro(int tamanho) {
        pessoas = new Pessoa[tamanho];
        contador = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas[contador] = pessoa;
        contador++;
    }

    public void imprimirCadastro() {
        for (int i = 0; i < contador; i++) {
            pessoas[i].imprimirDetalhes();
        }
    }
}