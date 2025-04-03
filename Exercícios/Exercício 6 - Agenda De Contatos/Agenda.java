import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> listaContatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone) {
        listaContatos.add(new Contato(nome, telefone));
        System.out.println("Contato adicionado: " + nome);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : listaContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirContatos() {
        if (listaContatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contato contato : listaContatos) {
                System.out.println(contato);
            }
        }
    }
}
