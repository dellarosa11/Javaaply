package fundamentojava;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws IOException {

        Scanner n = new Scanner(System.in);
        n.useLocale(Locale.US);

        int a = n.nextInt();
        double b = n.nextDouble();


        n.close();

        System.out.printf("%.3f km/l \n", a / b);
    }

}
