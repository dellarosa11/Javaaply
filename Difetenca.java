package fundamentojava;

import java.util.Scanner;

public class Difetenca {
	public static void main(String[] args) {
		//ler 4 valores, A, B, C,D
		
		
		Scanner n = new Scanner(System.in);
		int A = n.nextInt();
		int B = n.nextInt();
		int C = n.nextInt();
		int D = n.nextInt();
		n.close();
		
		int diferenca = ((A*B)-(C*D));
		
		
		System.out.println("DIFERENCA = "+diferenca);
		
		//calcular diferença de (A*B) pelo (C*D)
		
		
		
	}

}
