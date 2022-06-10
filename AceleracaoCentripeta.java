public class AceleracaoCentripeta {
    private double velocidadeLinear = 10;
    private double raio = 2;

    public double calculoAceleracaoCentripeta(){
        Calculadora calculadora = new Calculadora();
        return calculadora.divisao(calculadora.exponenciacao(velocidadeLinear, 2), raio);
    }
}
