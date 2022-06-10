import java.util.Scanner; 
import util.Calculadora;

public class Calcular_Fatorial {
    public static void main(String [] args){
        Calculadora calculadora = new Calculadora();

        java.util.Scanner scanner = new Scanner(System.in);

        double resultado;
        
        double resultadoFinal;

        System.out.println("Por favor, digite o número para cálculo do seu fatorial");
        peso = scanner.nextDouble();

        double num = n.nextdouble();

        resultado = num;

        for(double i = num - 1, i=0; i--){
            resultado = resultado * i;
            resultadoFinal = resultado;
        }

    
        System.out.println("O cálculo do fatorial é: " + resultadoFinal);
        
        scanner.close(); 
        
    }
}