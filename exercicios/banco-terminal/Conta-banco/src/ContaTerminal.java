import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis com os tipos corretos
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Solicitação dos dados ao usuário
        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        // Exibição da mensagem de boas-vindas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está  disponível para saque.");

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}