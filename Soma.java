package fundamentojava;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		System.out.print("___SOMAR___\n");
		Scanner soma = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int x = soma.nextInt();
		System.out.print("Digite o segundo numero: ");
		int y = soma.nextInt();
		int resultado = x + y;
		soma.close();
		
		System.out.println(" A SOMA DOS NUMEROS EH: " +resultado);		
	}
}
