package polimorfismo;


public class PJ extends Pessoa {
 private String CNPJ;
 private String IE;

 public PJ() {
     super();
     CNPJ = "";
     IE = "";
 }

 public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
     super(nome, telefone, endereco);
     this.CNPJ = CNPJ;
     this.IE = IE;
 }

 // Métodos comuns
 public String getCNPJ() {
     return CNPJ;
 }

 public String getIE() {
     return IE;
 }

 @Override
 public String toString() {
     return super.toString() + "\nCNPJ: " + CNPJ + "\nInscrição Estadual: " + IE;
 }
}

