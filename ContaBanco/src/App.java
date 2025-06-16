
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        System.out.print("Digite o número de sua agência:\n");
        int agencia = scanner.nextInt();
        

        System.out.print("Digite o número da sua conta: \n");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Confirme seu nome: \n");
        String nome = scanner.nextLine();

        System.out.print("Qual o valor de seu depósito inicial? Insira no formato xxxx,yy \n");
        double saldo = scanner.nextDouble();

        System.out.println(String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque.",
             nome, agencia, conta, saldo
             ));

    }
}
