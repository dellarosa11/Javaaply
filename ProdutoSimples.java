package fundamentojava;

import java.util.Scanner;

public class ProdutoSimples {
	public static void main(String[] args) {
		Scanner Produto = new Scanner(System.in);
		
		//Exercício 1004 - BeeCrowd

		
		//lendo dois valores
		int A = Produto.nextInt();
		int B = Produto.nextInt();
		Produto.close();
		
		int PROD = A*B;
		
		System.out.println("PROD = "+PROD);
	}

}
