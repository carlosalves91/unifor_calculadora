import java.util.Scanner; 
import util.Calculadora;

public class CalcularDistancia {
    public static void main(String [] args){
        Calculadora calculadora = new Calculadora();

        java.util.Scanner scanner = new Scanner(System.in);

        double distanciaAB;
        double distanciaBC; 

        System.out.println("Por favor digite a distancia entre os pontos A e B em metros.");
        distanciaAB = scanner.nextDouble();

        System.out.println("Por favor digite a distancia entre os pontos B e C em metros");
        distanciaBC = scanner.nextDouble();

        scanner.nextLine();

        double soma = Calculadora.soma (distanciaBC, distanciaAB);  

        System.out.println("A distancia entre os pontos A e C é de "+ soma +" metros");
        
        scanner.close(); 
        
    }
}