import java.util.Scanner;
import util.Calculadora;

public class CalcularTotaldaConta {
    public static void main(String [] args){
        Calculadora calculadora = new Calculadora();

        java.util.Scanner scanner = new Scanner(System.in);

        double total;
        double nPessoas;
        

       System.out.println("Informe o valor total da conta: ");
        total = scanner.nextDouble();

        System.out.println("Informe para quantas pessoas será dividido: ");
        nPessoas = scanner.nextDouble();

        double vDividido = calculadora.divisao (total, nPessoas);

    System.out.println("O valor da conta para cada pessoa é R$ "+ vDividido +" ");

        scanner.close();
    }

}




