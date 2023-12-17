package polimorfismo;

//Parente.java
public class Parente extends PF {
 private String email;

 public Parente() {
     super();
     email = "";
 }

 public Parente(String nome, String telefone, String endereco, String RG, String CPF, String email) {
     super(nome, telefone, endereco, RG, CPF);
     this.email = email;
 }

 // Método específico
 public String getEmail() {
     return email;
 }

 @Override
 public String toString() {
     return super.toString() + "\nE-mail: " + email;
 }
}
