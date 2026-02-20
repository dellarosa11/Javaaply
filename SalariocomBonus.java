package fundamentojava;

import java.util.Locale;
import java.util.Scanner;

public class SalariocomBonus {
	public static void main(String[] args) {
		//1.ler no de um vendendor
		//2.ler salario fixo e seu total de vendas efetuadas no mês, em dinheiro
		//sabendo qque tem 15% de comissao 
		
		
		Scanner n = new Scanner(System.in);
		n.useLocale(Locale.US);
		String Primeiro_Nome = n.next();
		double Salario_Fixo = n.nextDouble();
		double Montante_Vendas = n.nextDouble();

		n.close();

		double x = Salario_Fixo+(Montante_Vendas*0.15);
		String Frase = String.format("TOTAL = %.2f",x);
		System.out.println(Frase);
		
		
		
		
		
	}

}
