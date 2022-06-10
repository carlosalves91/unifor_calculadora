public class Forca {
    private double massa = 20;
    private double aceleracao = 5;

    public double calculoForca() {
        Calculadora calculadora = new Calculadora();
        return calculadora.multiplicacao(massa, aceleracao);
    }
}
