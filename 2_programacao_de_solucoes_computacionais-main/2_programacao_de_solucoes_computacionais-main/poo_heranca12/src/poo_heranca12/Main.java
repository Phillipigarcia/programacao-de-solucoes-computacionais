package poo_heranca12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadastro cadastro = new Cadastro(5);

        for (int i = 0; i < 1; i++) {
            PessoaFisica pessoaFisica = new PessoaFisica();
            System.out.println("Digite o nome (pessoa física):");
            pessoaFisica.setNome(scanner.nextLine());
            System.out.println("Digite o CPF (pessoa física):");
            pessoaFisica.setCPF(scanner.nextLine());
            cadastro.cadastrarPessoa(pessoaFisica);

            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            System.out.println("Digite o nome (pessoa jurídica):");
            pessoaJuridica.setNome(scanner.nextLine());
            System.out.println("Digite o CNPJ (pessoa jurídica):");
            pessoaJuridica.setCNPJ(scanner.nextLine());
            cadastro.cadastrarPessoa(pessoaJuridica);
        }

        cadastro.imprimirCadastro();
    }
}

