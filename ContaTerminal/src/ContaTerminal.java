import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao serviço de criação de conta, por faor providencie as informações necessárias.");

        
        System.out.println("Digite a agência em que quer fazer a conta: ");
        Integer novaAgencia = new Scanner(System.in).nextInt();

        System.out.println("Digite seu nome: ");
        String novoNome = new Scanner(System.in).nextLine();

        System.out.println("Digite o valor do seu depósito inicial: ");
        Double novoSaldo = new Scanner(System.in).nextDouble();

        Conta novaConta = new Conta(novoNome, novaAgencia, novoSaldo);

        System.out.println("Parabéns " + novaConta.getNome() + " Sua conta de número " + novaConta.getConta() + " na agencia " + novaConta.getAgencia() + " Foi criada com sucesso.");
        System.out.println("Seu saldo inicial é de: R$" + novaConta.getSaldo());
    }
}

class Conta{
    private int agencia;
    private int conta = 1234;
    private String nome;
    private Double saldo;

    Conta(String novoNome, int novaAgencia, Double novoSaldo){
        nome = novoNome;
        agencia = novaAgencia;
        saldo = novoSaldo;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public Double getSaldo() {
        return saldo;
    }

}
