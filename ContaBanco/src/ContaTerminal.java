import java.util.Scanner;

public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public ContaTerminal (int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nOlá, seja muito bem vindo ao nosso banco!\n\nPor favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("\nDigite o número da conta no formato '0000': ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite a agência no formato '000-0': ");
        String agencia = scanner.nextLine();

        System.out.println("\nQual o valor do pix que você deseja adicionar ao saldo? ");
        String saldoStr = scanner.nextLine().replace(",", ".");
        double saldo = Double.parseDouble(saldoStr);

       System.out.println("\nCerto "+nomeCliente+"! Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
        ", conta "+numero+ " e seu saldo de R$ "+saldo+ " já está disponível compras ou para saque.\n");

        scanner.close();
    }
}
