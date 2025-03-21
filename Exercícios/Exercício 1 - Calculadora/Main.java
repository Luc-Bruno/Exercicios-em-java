import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int i = 0;

        while ( i == 0) {
            System.out.println("Qual operação voce gostaria de realizar?");
            System.out.println("---------------");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("---------------");

            int a = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Selecione 2 números para sua operação");
            int num1 =leitor.nextInt();
            leitor.nextLine();

            int num2 =leitor.nextInt();
            leitor.nextLine();

            switch (a) {
                case 1:
                    Calculadora.Soma(num1,num2);
                    i++;
                    break;
                case 2:
                    Calculadora.Subtracao(num1,num2);
                    i++;
                    break;
                case 3:
                    Calculadora.Mult(num1,num2);
                    i++;
                    break;
                case 4:
                    Calculadora.Div(num1,num2);
                    i++;
                    break;
                default:
                    System.out.println("Número de operação inválido!");
            }
        }
    }
}