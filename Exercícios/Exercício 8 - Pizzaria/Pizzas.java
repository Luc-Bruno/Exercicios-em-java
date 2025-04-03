import java.util.List;

public class Pizzas {
    private String nome;
    private double preco;
    private List<String> ingredientes;

    public Pizzas(String nome, double preco, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String toString() {
        return "Pizza: " + nome + " | Preço: R$ " + preco + " | Ingredientes: " + ingredientes;
    }
}
