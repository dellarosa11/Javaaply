package fundamentojava;

import java.util.Scanner;

public class PraticandoConsole {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.close();
		
		System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d", nome,sobrenome,idade);
		
		
	
	}

}
