package fundamentojava;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) throws IOException {

		Scanner n = new Scanner(System.in);
		n.useLocale(Locale.US);

		double pecas[] = new double[2];

		for (int i = 0; i < 2; i++) {

			int C_peca = n.nextInt();
			int Q_peca = n.nextInt();
			double V_peca = n.nextDouble();
			
			pecas[i] = Q_peca*V_peca;
		
		}
		n.close();
		
		double T_pagar = Arrays.stream(pecas).sum();
		System.out.printf("VALOR A PAGAR: %.2f\n", T_pagar);
		

	}

}