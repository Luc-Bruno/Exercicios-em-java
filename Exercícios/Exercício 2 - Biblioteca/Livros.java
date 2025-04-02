import java.util.ArrayList;
import java.util.List;

public class Livros {

    private String titulo;
    private String autor;
    private int ano;

    private static List<Livros> listaLivros = new ArrayList<>();


    private Livros (String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public static void setLivros (String titulo, String autor, int ano){
        listaLivros.add(new Livros(titulo, autor, ano));
    }

    public static void getLivros(){
        System.out.println("Seus livros são: ");
        for (Livros livro : listaLivros) {
            System.out.println("Título: " + livro.titulo);
            System.out.println("Autor: " + livro.autor);
            System.out.println("Ano: " + livro.ano);
            System.out.println("----");
        }

    }
}
