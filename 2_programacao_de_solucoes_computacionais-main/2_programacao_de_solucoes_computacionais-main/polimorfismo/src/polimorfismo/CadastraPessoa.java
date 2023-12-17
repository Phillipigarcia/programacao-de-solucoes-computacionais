package polimorfismo;

import javax.swing.JOptionPane;

public class CadastraPessoa {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1. Pessoa física\n2. Pessoa Jurídica"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String endereco = JOptionPane.showInputDialog("Digite o endereço");

        Pessoa objPessoa;

        if (opcao == 1) {
            String RG = JOptionPane.showInputDialog("Digite o RG");
            String CPF = JOptionPane.showInputDialog("Digite o CPF");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1. Amigos\n2. Parentes"));

            if (opcao == 1) {
                String blog = JOptionPane.showInputDialog("Digite o blog");
                objPessoa = new Amigo(nome, telefone, endereco, RG, CPF, blog);
            } else if (opcao == 2) {
                String email = JOptionPane.showInputDialog("Digite o e-mail");
                objPessoa = new Parente(nome, telefone, endereco, RG, CPF, email);
            } else {
                objPessoa = new PF(nome, telefone, endereco, RG, CPF);
            }
        } else if (opcao == 2) {
            String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ");
            String IE = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
            objPessoa = new PJ(nome, telefone, endereco, CNPJ, IE);
        } else {
            objPessoa = new Pessoa(nome, telefone, endereco);
        }

        // Exibe as informações utilizando o método toString()
        JOptionPane.showMessageDialog(null, objPessoa.toString());
    }
}
