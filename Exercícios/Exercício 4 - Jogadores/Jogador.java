import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {

    public static Scanner leitor = new Scanner(System.in);
    private String nome;
    private int pontuacao;
    private int nivel;

    private static List<Jogador> listaDeJogadores = new ArrayList<>();

    private Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }


    public static void setjogadores(String nome, int pontuacao, int nivel) {
        listaDeJogadores.add(new Jogador(nome, pontuacao, nivel));
    }

    public static void getJogadores() {
        for (Jogador jogador : listaDeJogadores) {
            System.out.println("Nome do Jogador: " + jogador.nome);
            System.out.println("Pontuação: " + jogador.pontuacao);
            System.out.println("Nível: " + jogador.nivel);
            System.out.println("----");
        }
    }

    public static void buscaJogadoresNivel(String busca) {
        boolean encontrado = false;

        for (Jogador jogador : listaDeJogadores) {
            if (jogador.nome.equalsIgnoreCase(busca)) {
                System.out.println("Digite o novo nível do jogador: ");
                int novoNivel = leitor.nextInt();
                leitor.nextLine();

                jogador.nivel = novoNivel;
                System.out.println("Nível alterado com sucesso para " + jogador.nome + "!");
                encontrado = true;
                 break;
            }
        }

        if (!encontrado) {

            System.out.println(busca + " não foi encontrado na lista.");

        }

    }

    public static void buscaJogadoresPontuacao(String busca2) {
        boolean encontrado = false;

        for (Jogador jogador : listaDeJogadores) {
            if (jogador.nome.equalsIgnoreCase(busca2)) {
                System.out.println("Digite a nova pontuação do jogador: ");
                int novapontuacao = leitor.nextInt();
                leitor.nextLine();

                jogador.pontuacao = novapontuacao;
                System.out.println("Pontuação alterado com sucesso para " + jogador.nome + "!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {

            System.out.println(busca2 + " não foi encontrado na lista.");

        }

    }
}