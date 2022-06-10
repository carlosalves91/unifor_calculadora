package util;

public class AceleracaoCentripeta {
    private double velocidadeLinear = 10;
    private double raio = 2;

    public double calculoAceleracaoCentripeta(){
        Calculadora calculadora = new Calculadora();
        return calculadora.divisao(calculadora.exponencial(velocidadeLinear, 2), raio);
    }
}
