package fundamentojava;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Long l = 10000L;
		Integer i = Integer.parseInt(entrada.next());
		entrada.close();
		
		System.out.println(i.toString());
		

	}
}
