public class Carro {
    // Atributos privados da classe Carro
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    // Construtor da classe Carro
    // Inicializa os atributos do carro quando um novo objeto é criado
    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; // Inicializa a velocidade como 0
    }

    // Método para acelerar o carro
    // Aumenta a velocidade atual do carro em 'incremento' km/h
    public void acelerar(int incremento) {
        this.velocidadeAtual += incremento;
        System.out.println("O carro acelerou para " + this.velocidadeAtual + " km/h.");
    }

    // Método para frear o carro
    // Diminui a velocidade atual do carro em 'decremento' km/h
    // Se a velocidade atual for menor que o decremento, o carro para completamente
    public void frear(int decremento) {
        if (this.velocidadeAtual >= decremento) {
            this.velocidadeAtual -= decremento;
            System.out.println("O carro freou para " + this.velocidadeAtual + " km/h.");
        } else {
            this.velocidadeAtual = 0;
            System.out.println("O carro parou completamente.");
        }
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }
}