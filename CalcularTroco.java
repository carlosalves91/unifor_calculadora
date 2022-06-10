import java.util.Scanner;
import util.Calculadora;

public class CalcularTroco {
    public static void main(String [] args){
        Calculadora calculadora = new Calculadora();

        java.util.Scanner scanner = new Scanner(System.in);

        double quantiaOferecida;
        double quantiaTotal;

        System.out.println("Informe quanto você recebeu do cliente.");
        quantiaOferecida = scanner.nextDouble();

        System.out.println("Informe quanto as compras do cliente totalizaram.");
        quantiaTotal = scanner.nextDouble();

        scanner.nextLine();

        double subtracao = calculadora.subtracao (quantiaOferecida, quantiaTotal);

        System.out.println("O troco a ser oferecido ao cliente é "+ subtracao +" reais");

        scanner.close();
    }

}