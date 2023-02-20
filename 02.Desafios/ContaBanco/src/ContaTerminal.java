import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner formularioAcesso = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o número de sua conta");
      int numero = formularioAcesso.nextInt();

      System.out.println("Digite a sua agência com dígito");
      String agencia = formularioAcesso.next();

      System.out.println("Digite o seu nome");
      String nomeCliente = formularioAcesso.next();

      System.out.println("Digite o seu sobrenome");
      String sobrenomeCliente = formularioAcesso.next();

      System.out.println("Digite o seu saldo");
      Double saldo = formularioAcesso.nextDouble();


        // int numero = Integer.valueOf(args[0]);
        // String agencia = args[1];
        // String nomeCliente = args [2];
        // Double saldo = Double.valueOf(args[3]);

        System.out.println("Olá " + nomeCliente +" "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}