package fundamentojava;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class DistanciaDoisPontos {
    public static void main(String[] args) throws IOException {

        Scanner n = new Scanner(System.in);
        n.useLocale(Locale.US);

        double x1 = n.nextDouble();
        double y1 = n.nextDouble();
        double x2 = n.nextDouble();
        double y2 = n.nextDouble();

        n.close();

        double parte1 = Math.pow(x2 - x1, 2);
        double parte2 = Math.pow(y2 - y1, 2);

        double distancia = Math.sqrt(parte1 + parte2);

        System.out.printf("%.4f",distancia);
        System.out.println("");


    }
}