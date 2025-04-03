public class Main {
    public static void main(String[] args) {
        // Cria um objeto Carro chamado meuCarro com os seguintes atributos:
        // marca: "Chevrolet", modelo: "Camaro", ano: 1969, placa: "ABC-1234"
        Carro meuCarro = new Carro("Chevrolet", "Camaro", 1969, "ABC-1234");

        // Exibe as informações do carro usando o método exibirInformacoes()
        meuCarro.exibirInformacoes();

        // Acelera o carro em 20 km/h
        meuCarro.acelerar(20);

        // Freia o carro em 10 km/h
        meuCarro.frear(10);

        // Acelera o carro em 50 km/h
        meuCarro.acelerar(50);

        // Freia o carro em 80 km/h (o carro deve parar completamente)
        meuCarro.frear(80);
    }
}