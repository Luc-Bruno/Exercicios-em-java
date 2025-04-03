import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        while (x == 0) {

            Scanner leitor = new Scanner(System.in);

            System.out.println("Oque gostaria de fazer?");
            System.out.println("1 - Cadastrar um novo jogador");
            System.out.println("2 - Aumentar o nível de um jogador");
            System.out.println("3 - Aumentar a pontuação de um jogador");
            System.out.println("4 - Mostrar jogadores");
            System.out.println("5 - Sair");
            System.out.println("----------");
            int a = leitor.nextInt();
            leitor.nextLine();

            switch (a) {
                case 1:
                    System.out.println("Quantos jogadores gostaria de cadastrar? ");
                    int b = leitor.nextInt();
                    leitor.nextLine();

                    for (int i = 0; i < b; i++) {
                        System.out.println("Digite o nome do jogador:");
                        String nome = leitor.nextLine();

                        System.out.println("Digite a pontuação atual do jogador");
                        int pontuacao = leitor.nextInt();
                        leitor.nextLine();

                        System.out.println("Digite o nível atual do jogador:");
                        int nivel = leitor.nextInt();

                        Jogador.setjogadores(nome, pontuacao, nivel);
                    }

                    break;

                case 2:
                        System.out.println("Digite o nome do jogador que deseja procurar:");
                        String busca = leitor.nextLine();
                        Jogador.buscaJogadoresNivel(busca);
                    break;

                case 3:
                    System.out.println("Digite o nome do jogador que deseja procurar:");
                    String busca2 = leitor.nextLine();
                    Jogador.buscaJogadoresPontuacao(busca2);
                    break;

                case 4:
                    Jogador.getJogadores();
                    break;

                case 5:
                    System.out.println("até a próxima! :)");
                    x++;
                    break;

                default:
                    System.out.println("Número invalido, escolha novamente: ");
            }
        }
    }
}