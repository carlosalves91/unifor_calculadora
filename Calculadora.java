import static java.lang.Math.*;

public class Calculadora {

	public static double soma(double numeroA, double numeroB) {
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

    public double exponenciacao(double numeroA, double numeroB){
        return (double) Math.pow(numeroA, numeroB);
    }
    public double raiz(double numeroA) {
        if (numeroA >= 0) return sqrt(numeroA);
        else {
            throw new IllegalArgumentException("O numeroB nao pode ser menor do que 0!");
        }
    }
}