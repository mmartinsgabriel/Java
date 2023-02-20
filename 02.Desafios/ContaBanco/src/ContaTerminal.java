import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner formularioAcesso = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o número de sua conta Ex: 1234");
      int numero = formularioAcesso.nextInt();

      System.out.println("Digite a sua agência com dígito Ex: 012-3");
      String agencia = formularioAcesso.next();

      System.out.println("Digite o seu nome");
      String nomeCliente = formularioAcesso.next();

      System.out.println("Digite o seu sobrenome");
      String sobrenomeCliente = formularioAcesso.next();

      System.out.println("Digite o seu saldo Ex: 100.10");
      Double saldo = formularioAcesso.nextDouble();

        System.out.println("Olá " + nomeCliente +" "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}