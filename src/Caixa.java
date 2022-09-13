import java.util.Scanner;
import java.util.Random;

public class Caixa {


    public static void main(String[] args){
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        System.out.println("Iniciando novo cadastro!");
        System.out.print("Informe seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Realize um depósito inicial, informe o valor a seguir: ");
        inicial = entrada.nextDouble();

        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
    }

}