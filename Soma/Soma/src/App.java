import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Criando a variavel para permitir que o usuário digite um
        Scanner entrada = new Scanner(System.in);
        int operacao;

        System.out.println("Digite um número");
        // comando para usuário digitar numero inteiro
        int numero1 = entrada.nextInt();
        
        System.out.println("Digite um número");
        // comando para usuário digitar numero inteiro
        int numero2 = entrada.nextInt();

        //Operação de soma

        operacao = numero1 + numero2;

        System.out.println("A soma dos valores é " + operacao);

    }
}
