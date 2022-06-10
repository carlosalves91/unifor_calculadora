public class EnergiaCinetica {
    private double massa = 50;
    private double velocidade = 10;

    public double calculoEnergiaCinetica() {
        Calculadora calculadora = new Calculadora();
        return calculadora.divisao(calculadora.multiplicacao(massa, calculadora.exponenciacao(velocidade, 2)), 2);
    }
}
