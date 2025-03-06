import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Objeto da classe Scanner para receber os dados inseridos pelo usuário
        Scanner sc = new Scanner(System.in);
        
        // Formatação do saldo para a moeda do país (Real)
        Locale locale = new Locale("pt", "BR");
        NumberFormat formatador =  NumberFormat.getCurrencyInstance(locale);
        
        Integer conta = null;
        Boolean dadoValido = false; // flag para validação de dados
        
        // Validação do número da conta
        do {
            // Se for um número válido, vá para a próxima instrução.
            try {
                dadoValido = true;
                System.out.println("Digite o número da sua conta: ");
                conta = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) { // Se não for um número válido, tente novamente
                dadoValido = false;
                System.out.println("O dado inserido é inválido.");
            }
        } while (dadoValido != true);

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        Double saldo = Double.parseDouble(sc.nextLine());
        
        String msg = String.format("Olá " + nome + 
        ", obrigado por criar uma conta em nosso banco.\nSua agência é " + agencia + 
        ", conta " + conta + 
        " e seu saldo de " + formatador.format(saldo) + " já está disponível para saque."
            );

        System.out.println(msg);
    }
}
