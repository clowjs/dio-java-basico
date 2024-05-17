import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String agencia;
        int numero;
        String titular;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Digital");
        System.out.println("Vamos criar a sua conta");

        System.out.println("Digite o numero da sua Agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o numero da sua Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do Titular: ");
        titular = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
