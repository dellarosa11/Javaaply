package fundamentojava;

import java.util.Locale;
import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		n.useLocale(Locale.US);
		
		double a = n.nextDouble();
		double b = n.nextDouble();
		double c = n.nextDouble();
		
		//a tem peso 2
		//b tem peso 3
		//c tem peso 5
		a = a*0.20;
		b = b*0.30;
		c = c*0.50;
		
		double media = (a+b+c)/(0.20+0.30+0.50);
		
		String frase = String.format("MEDIA = %.1f",media);
		
		System.out.println(frase);
		
		
		
	}

}
