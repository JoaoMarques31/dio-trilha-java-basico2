import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
     public static void main(String[] args) throws Exception {
     //criando o objeto scanner 
     java.util.Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
     System.out.println("Digite seu nome");
     String nomeCliente = scanner.next();

     System.out.println("Digite o numero da conta");
     int numConta = scanner.nextInt();

     System.out.println("Digite o numero da Agencia");
     float numAgencia = scanner.nextFloat();

     System.out.println("Digite o eu Saldo");
     double Saldo = scanner.nextDouble();
     
     System.out.println("Ola" +" " +nomeCliente+" "+ "obrigado por criar uma conta em nosso banco, su agencia e"+" " +numAgencia+" "+ ",conta"+" " +numConta+" " + " e seu saldo ,"+" "+Saldo+" "+ "ja esta disponivel para saque");
    }
}
