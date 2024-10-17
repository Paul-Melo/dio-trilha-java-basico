
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da conta.");
        int conta = scanner.nextInt();

        System.out.println("Informe o número da agência com DV. Ex: 12345-6");
        String agencia = scanner.next();

        System.out.println("Digite seu nome.");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome.");
        String sobrenome = scanner.next();

        double saldo = 15250.00;

        // Definir formato de moeda brasileiro

        Locale pt = new Locale("pt", "BR"); 
        NumberFormat formatador = NumberFormat.getCurrencyInstance(pt);

        //Exibir a mensagem da conta criada

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + ", seu saldo é R$ " + formatador.format(saldo) + ", e já está disponível para saque.");
    }
}
