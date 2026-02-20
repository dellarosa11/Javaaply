package fundamentojava;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		n.useLocale(Locale.US);
		
		
		int N_Funcionario = n.nextInt();
		int N_Horas_Trabalhadas = n.nextInt();
		double Valor_Hora = n.nextDouble();	
		n.close();
		
		double Salario = N_Horas_Trabalhadas*Valor_Hora;
		String frase = String.format("SALARY = U$ %.2f", Salario);
		System.out.println("NUMBER = "+N_Funcionario);
		System.out.println(frase);
		
	
	}

}
