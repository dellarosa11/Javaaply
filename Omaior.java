package fundamentojava;

import java.util.Scanner;

public class Omaior {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite 3 valores: ");
        
        double valores[] = new double[3];
        
        for (int i = 0; i < 3; i++) {
            valores[i] = n.nextDouble();
        }

        double maior = valores[0];

        for (int i = 1; i < 3; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior);

        n.close();
    }
}