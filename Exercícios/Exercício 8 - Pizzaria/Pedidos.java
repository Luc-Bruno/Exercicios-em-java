import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private String endereco;
    private Pizzas pizzaEscolhida;

    private static List<Pedidos> listaPedidos = new ArrayList<>();

    public Pedidos(String endereco, Pizzas pizzaEscolhida) {
        this.endereco = endereco;
        this.pizzaEscolhida = pizzaEscolhida;
    }

    public static void adicionarPedido(String endereco, Pizzas pizzaEscolhida) {
        listaPedidos.add(new Pedidos(endereco, pizzaEscolhida));
        System.out.println("Pedido adicionado com sucesso!");
    }

    public static void exibirPedidos() {
        if (listaPedidos.isEmpty()) {
            System.out.println("Nenhum pedido realizado.");
        } else {
            System.out.println("Pedidos realizados:");
            for (Pedidos pedido : listaPedidos) {
                System.out.println("Endereço: " + pedido.endereco);
                System.out.println("Pizza: " + pedido.pizzaEscolhida);
                System.out.println("----");
            }
        }
    }

    public static void cancelarPedido(String endereco) {
        boolean encontrado = false;
        for (Pedidos pedido : listaPedidos) {
            if (pedido.endereco.equalsIgnoreCase(endereco)) {
                listaPedidos.remove(pedido);
                System.out.println("Pedido cancelado com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Endereço não encontrado.");
        }
    }
}
