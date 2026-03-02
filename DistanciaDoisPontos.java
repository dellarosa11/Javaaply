package fundamentojava;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) throws IOException {
        Scanner n = new Scanner(System.in);

        double p[] = new double[2];

        for (int i = 0; i < 2; i++) {
            double A = n.nextDouble();
            double B = n.nextDouble();

            p[i] = Math.pow(A - B, 2);
        }

        n.close();

        double soma = Arrays.stream(p).sum();
        double raiz = Math.sqrt(soma);

        System.out.println(raiz);
    }
}