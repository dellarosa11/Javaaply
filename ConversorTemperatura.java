package fundamentojava;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {

		final int ParteFormula = 32;
		final double Valor = 5/9.0;
		Scanner fahrenheit = new  Scanner(System.in);
		
		System.out.print("DIGITE O VALOR EM FAHRENHEIT: ");
		int F = fahrenheit.nextInt();	
		
		double resultado = (F - ParteFormula)*Valor;
		fahrenheit.close();
		System.out.println("Conversor Temperatura");
		System.out.printf("O resultado da conversão eh: %.2fºC",resultado);
		
		
		
		
		System.out.println("a soma dos numeros eh : ");
		
	}

}
