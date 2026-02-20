package fundamentojava;
import java.util.Locale;
import java.util.Scanner;

public class Media1 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		n.useLocale(Locale.US);
	
	
	double a = n.nextDouble();
	double b = n.nextDouble();

	a = a*0.35;
	b = b*0.75;
	
	double media = (a+b)/(0.35+0.75);
	String frase= String.format("MEDIA = %.5f", media);
	
	System.out.println(frase);
	
	}

}
