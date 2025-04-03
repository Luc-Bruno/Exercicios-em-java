import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pizzas> cardapio = new ArrayList<>();
        cardapio.add(new Pizzas("Mussarela", 30.00, List.of("Queijo", "Molho de Tomate")));
        cardapio.add(new Pizzas("Calabresa", 35.00, List.of("Calabresa", "Queijo", "Molho de Tomate")));
        cardapio.add(new Pizzas("Frango com Catupiry", 40.00, List.of("Frango", "Catupiry", "Queijo", "Molho de Tomate")));

        while (true) {
            System.out.println("Oque gostaria de fazer?");
            System.out.println("1. Mostrar cardápio");
            System.out.println("2. Realizar pedido");
            System.out.println("3. Exibir pedidos");
            System.out.println("4. Cancelar pedido");
            System.out.println("5. Sair");
            System.out.println("------------");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cardápio:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println((i + 1) + ". " + cardapio.get(i));
                    }
                    break;

                case 2:
                    System.out.println("Escolha uma pizza pelo número:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println((i + 1) + ". " + cardapio.get(i).getNome());
                    }
                    int escolha = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    if (escolha > 0 && escolha <= cardapio.size()) {
                        System.out.print("Digite o endereço de entrega: ");
                        String endereco = scanner.nextLine();
                        Pedidos.adicionarPedido(endereco, cardapio.get(escolha - 1));
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    Pedidos.exibirPedidos();
                    break;

                case 4:
                    System.out.print("Digite o endereço para cancelar o pedido: ");
                    String enderecoCancelamento = scanner.nextLine();
                    Pedidos.cancelarPedido(enderecoCancelamento);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}