import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Exibir todos os contatos");
            System.out.println("4 - Sair");
            System.out.println("---------");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = leitor.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;

                case 2:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = leitor.nextLine();
                    Contato contato = agenda.buscarContato(nomeBusca);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    agenda.exibirContatos();
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    leitor.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}