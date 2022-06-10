public class CalcularDistancia {
    private double distanciaAB = 80;
    private double distanciaBC = 90;
    
    public double somandoDistancia(){
        Calculadora calculadora = new Calculadora();

        double soma = Calculadora.soma(distanciaAB, distanciaBC);
        return soma; 

    }
}