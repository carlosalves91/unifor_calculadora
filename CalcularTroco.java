public class CalcularTroco {

    private double quantiaOferecida = 30;
    private double quantiaTotal = 23;

    public double calculandoTroco(){

        Calculadora calculadora = new Calculadora();

        double subtracao = calculadora.subtracao(quantiaTotal, quantiaOferecida);
        return subtracao;

    }
}