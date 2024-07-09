import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o numero da sua conta? ");
        int numero = ler.nextInt();

        System.out.println("Digite o numero da sua agencia: ");
        String agencia = ler.next();

        System.out.println("Informe seu nome: ");
        String nome = ler.next();

        System.out.println("Informe seu saldo: ");
        double saldo = ler.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);


    }
}
