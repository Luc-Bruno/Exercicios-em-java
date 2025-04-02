import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        while (x == 0) {

            Scanner leitor = new Scanner(System.in);

            System.out.println("Oque gostaria de fazer?");
            System.out.println("1 - Cadastrar um novo livro");
            System.out.println("2 - Exibir informações de livros");
            System.out.println("3 - Sair");
            int a = leitor.nextInt();
            leitor.nextLine();

            switch (a) {
                case 1:
                    System.out.println("Quantos livros gostaria de cadastrar? ");
                    int b = leitor.nextInt();
                    leitor.nextLine();

                    for (int i = 0; i < b; i++) {
                        System.out.println("Digite o titulo do livro:");
                        String titulo = leitor.nextLine();

                        System.out.println("Digite o autor do livro:");
                        String autor = leitor.nextLine();

                        System.out.println("Digite o ano do livro:");
                        int ano = leitor.nextInt();
                        leitor.nextLine();

                        Livros.setLivros(titulo, autor, ano);
                    }

                    break;

                case 2:
                    Livros.getLivros();
                    break;

                case 3:
                    System.out.println("até a próxima! :)");
                    x++;
                    break;

                default:
                    System.out.println("Número invalido, escolha novamente: ");
            }
        }
    }
}