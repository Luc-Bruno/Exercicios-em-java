public class ContaBancaria {
    // Atributos privados da classe ContaBancaria
    private int numeroConta; // Número da conta bancária
    private String nomeTitular; // Nome do titular da conta
    private double saldo; // Saldo da conta

    // Construtor da classe ContaBancaria
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta; // Inicializa o número da conta
        this.nomeTitular = nomeTitular; // Inicializa o nome do titular
        this.saldo = 0.0; // Inicializa o saldo com 0.0
    }

    // Método para realizar um depósito na conta
    public void depositar(double valor) {
        if (valor > 0) { // Verifica se o valor do depósito é válido
            this.saldo += valor; // Adiciona o valor ao saldo
            System.out.println("Depósito de R$" + valor + " realizado com sucesso."); // Imprime mensagem de sucesso
        } else {
            System.out.println("Valor de depósito inválido."); // Imprime mensagem de erro
        }
    }

    // Método para realizar um saque na conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) { // Verifica se o valor do saque é válido e se há saldo suficiente
            this.saldo -= valor; // Subtrai o valor do saldo
            System.out.println("Saque de R$" + valor + " realizado com sucesso."); // Imprime mensagem de sucesso
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido."); // Imprime mensagem de erro
        }
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return this.saldo; // Retorna o saldo da conta
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da conta: " + this.numeroConta); // Imprime o número da conta
        System.out.println("Nome do titular: " + this.nomeTitular); // Imprime o nome do titular
        System.out.println("Saldo: R$" + this.saldo); // Imprime o saldo
    }
}