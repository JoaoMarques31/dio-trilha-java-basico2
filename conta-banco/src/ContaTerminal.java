import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
     public static void main(String[] args) throws Exception {
     //criando o dado da Conta 
     java.util.Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
     System.out.println("Digite seu nome");
     String nomeCliente = scanner.nextLine();

     System.out.println("Digite o numero da conta");
     int numConta = scanner.nextInt();

     System.out.println("Digite o numero da Agencia");
     String numAgencia = scanner.next();

     System.out.println("Digite o seu Saldo");
     double Saldo = scanner.nextDouble();
     
     System.out.println("Ola" +" " +nomeCliente+" "+ "obrigado por criar uma conta em nosso banco, sua agencia e"+" " +numAgencia+" "+ ",conta"+" " +numConta+" " + " e seu saldo ,"+" "+Saldo+" "+ "ja esta disponivel para saque");
    }
}
