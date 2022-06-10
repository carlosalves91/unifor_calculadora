package util;

public class Calcula_IMC {

    private double peso = 70;
    private double altura = 1.66;
    
    public double alturaAoQuadrado(){
        Calculadora calculadora = new Calculadora();
        return calculadora.exponenciacao(altura);
    }

    public double calculaIMC() {
        Calculadora calculadora = new Calculadora();
        return calculadora.divisao(peso, altura);
    }
}