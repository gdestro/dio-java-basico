import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        System.out.println("Por favor, digite o número de sua agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta!");
        numero = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        
    }
}
