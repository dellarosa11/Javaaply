package fundamentojava;

import java.util.Locale;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        n.useLocale(Locale.US);

        double A = n.nextDouble();
        double B = n.nextDouble();
        double C = n.nextDouble();
        n.close();

        double pi = 3.14159;

        double area_Triangulo = (A * C) / 2.0;
        double area_Circulo = pi * Math.pow(C, 2);
        double area_Trapezio = ((A + B) * C) / 2.0;
        double area_Quadrado = Math.pow(B, 2);
        double area_Retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", area_Triangulo);
        System.out.printf("CIRCULO: %.3f\n", area_Circulo);
        System.out.printf("TRAPEZIO: %.3f\n", area_Trapezio);
        System.out.printf("QUADRADO: %.3f\n", area_Quadrado);
        System.out.printf("RETANGULO: %.3f\n", area_Retangulo);
    }
}