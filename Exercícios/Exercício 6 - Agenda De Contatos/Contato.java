public class Contato {
    String nome;
    String telefone;

    Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }

}
