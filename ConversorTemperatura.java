package fundamentojava;

public class ConversorTemperatura {
	public static void main(String[] args) {
		int F = 86;
		final int ParteFormula = 32;
		final double Valor = 5/9.0;
		
		
		double resultado = (F - ParteFormula)*Valor;
		
		System.out.println("Conversor Temperatura");
		System.out.println("O resultado da conversão eh: " + resultado);
		
	}

}
