public class Main {
    public static void main(String[] args) {
        // Cria duas instâncias da classe ContaBancaria
        ContaBancaria conta1 = new ContaBancaria(123, "João Silva");
        ContaBancaria conta2 = new ContaBancaria(456, "Maria Oliveira");

        // Realiza operações nas contas
        conta1.depositar(1000.0); // Deposita 1000 na conta1
        conta1.sacar(500.0); // Saca 500 da conta1
        conta2.depositar(2000.0); // Deposita 2000 na conta2
        conta2.sacar(1000.0); // Saca 1000 da conta2

        // Exibe informações das contas
        System.out.println("\nInformações da Conta 1:");
        conta1.exibirInformacoes(); // Exibe informações da conta1

        System.out.println("\nInformações da Conta 2:");
        conta2.exibirInformacoes(); // Exibe informações da conta2
    }
}