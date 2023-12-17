package polimorfismo;


public class Pessoa {
 private String nome;
 private String telefone;
 private String endereco;

 public Pessoa() {
     nome = "";
     telefone = "";
     endereco = "";
 }

 public Pessoa(String nome, String telefone, String endereco) {
     this.nome = nome;
     this.telefone = telefone;
     this.endereco = endereco;
 }

 // Métodos comuns
 public String getNome() {
     return nome;
 }

 public String getTelefone() {
     return telefone;
 }

 public String getEndereco() {
     return endereco;
 }

 @Override
 public String toString() {
     return "Nome: " + nome + "\nTelefone: " + telefone + "\nEndereço: " + endereco;
 }
}


