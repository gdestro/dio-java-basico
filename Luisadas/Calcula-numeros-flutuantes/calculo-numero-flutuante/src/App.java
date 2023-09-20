import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);

        double A, B, soma;

        A = sc.nextDouble();
        B = sc.nextDouble();

        soma = A + B;
        
        //Quando utilizar o format usar o caracter (,) responsável pela concatenação 
        System.out.printf("Valor = %.2f", soma); //%.nf é usado para definir quantas casas quero exibir depois da virgula

    }
}
