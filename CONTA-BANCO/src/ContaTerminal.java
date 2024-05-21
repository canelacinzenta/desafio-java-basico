import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //exibir as mensagens para o usuário
        //obter pela classe Scanner os valores digitados no terminal
        //exibir a mensagem final

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite seu nome e sobrenome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
        
    }
}
