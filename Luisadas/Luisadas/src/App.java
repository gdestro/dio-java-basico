import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String name;
        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade");

            idade = entrada.nextInt();

        System.out.println("Digite seu nome");
        
            name = entrada.next();
        
        
        System.out.println("Olá, " + name + " Sua idade é " + idade);
    

        System.out.println("Hello, World!");
    
    }
}
