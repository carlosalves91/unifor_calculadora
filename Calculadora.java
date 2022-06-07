import static java.lang.Math.*;

public class Calculadora {

	public double soma(double numeroA, double numeroB) {
		return numeroA + numeroB;
	}
	
	public double subtracao(double numeroA, double numeroB) {
		return numeroA - numeroB;
	}

	public static double multiplicacao(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }

    public static double divisao(double numeroA, double numeroB) {
        return numeroA / numeroB;
    }

	public double teto(double numeroA) {
        return ceil(numeroA);
    }

    public double piso(double numeroA){
        return floor(numeroA);
    }
}