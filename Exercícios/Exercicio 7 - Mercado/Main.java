import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    // Atributos da classe Produto
    String nome;
    String codigo;
    double preco;
    int quantidadeEstoque;

    // Construtor da classe Produto
    public Produto(String nome, String codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método toString() para exibir informações do produto
    @Override
    public String toString() {
        return "Nome: " + nome + ", Código: " + codigo + ", Preço: R$" + preco + ", Estoque: " + quantidadeEstoque;
    }
}

public class Main { // Nome da classe alterado para Main
    public static void main(String[] args) {
        // Lista para armazenar os produtos em estoque
        List<Produto> estoque = new ArrayList<>();
        // Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            // Exibe o menu principal
            System.out.println("\n--- Gerenciador de Estoque ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Gerar Relatório de Estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // Recebe a opção do usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;
                case 2:
                    atualizarProduto(estoque, scanner);
                    break;
                case 3:
                    removerProduto(estoque, scanner);
                    break;
                case 4:
                    gerarRelatorioEstoque(estoque);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0); // Repete o loop até que o usuário escolha sair

        scanner.close(); // Fecha o scanner
    }

    // Método para adicionar um produto ao estoque
    public static void adicionarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do produto: ");
        String codigo = scanner.nextLine();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        // Cria um novo objeto Produto e o adiciona à lista de estoque
        Produto novoProduto = new Produto(nome, codigo, preco, quantidadeEstoque);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    // Método para atualizar um produto existente no estoque
    public static void atualizarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Código do produto a ser atualizado: ");
        String codigo = scanner.nextLine();

        // Busca o produto na lista de estoque
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                // Atualiza o preço e a quantidade em estoque do produto
                System.out.print("Novo preço: ");
                produto.setPreco(scanner.nextDouble());
                System.out.print("Nova quantidade em estoque: ");
                produto.setQuantidadeEstoque(scanner.nextInt());
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    // Método para remover um produto do estoque
    public static void removerProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Código do produto a ser removido: ");
        String codigo = scanner.nextLine();

        // Busca o produto na lista de estoque
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                // Remove o produto da lista de estoque
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    // Método para gerar um relatório de estoque
    public static void gerarRelatorioEstoque(List<Produto> estoque) {
        System.out.println("\n--- Relatório de Estoque ---");
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio!");
            return;
        }

        double valorTotalEstoque = 0;
        // Exibe informações de cada produto no estoque e calcula o valor total em estoque
        for (Produto produto : estoque) {
            System.out.println(produto);
            valorTotalEstoque += produto.getPreco() * produto.getQuantidadeEstoque();
        }
        System.out.println("\nValor total em estoque: R$" + valorTotalEstoque);
    }
}