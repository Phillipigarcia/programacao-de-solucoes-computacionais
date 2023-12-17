package heranca;

public class TesteClasses {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 30, 160.5, 55.0);
        System.out.println("Informações da Pessoa:\n" + pessoa1.getInfo() + "\n");

        Empregado empregado1 = new Empregado("Bob", 25, 175.0, 70.0, 12345, 3000.0, 10.0);
        System.out.println("Informações do Empregado:\n" + empregado1.getInfo());
        System.out.println("Salário do Empregado: R$" + empregado1.calcularSalario() + "\n");

        Cliente cliente1 = new Cliente("Charlie", 35, 170.0, 80.0, 5000.0, 2000.0);
        System.out.println("Informações do Cliente:\n" + cliente1.getInfo());
        System.out.println("Saldo do Cliente: R$" + cliente1.obterSaldo() + "\n");

        Administrador administrador1 = new Administrador("David", 40, 180.0, 90.0, 56789, 4000.0, 10.0, 500.0);
        System.out.println("Informações do Administrador:\n" + administrador1.getInfo());
        System.out.println("Salário do Administrador: R$" + administrador1.calcularSalario() + "\n");

        Operario operario1 = new Operario("Eve", 28, 165.0, 60.0, 23456, 2500.0, 9.0, 1000.0, 5.0);
        System.out.println("Informações do Operario:\n" + operario1.getInfo());
        System.out.println("Salário do Operario: R$" + operario1.calcularSalario() + "\n");

        Vendedor vendedor1 = new Vendedor("Frank", 32, 175.0, 70.0, 34567, 3500.0, 8.0, 5000.0, 6.0);
        System.out.println("Informações do Vendedor:\n" + vendedor1.getInfo());
        System.out.println("Salário do Vendedor: R$" + vendedor1.calcularSalario());
    }
}
