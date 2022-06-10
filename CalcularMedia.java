import java.util.Scanner;
import util.Calculadora;

public class CalcularMedia {
    public static void main(String [] args){
        Calculadora calculadora = new Calculadora();

        java.util.Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        

       System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextDouble();

        double totalNotas = calculadora.soma (nota1, nota2);
        double media = calculadora.divisao (totalNotas)/2;

    System.out.println("A nota "+ media +" é a média do Aluno");

        scanner.close();
    }

}