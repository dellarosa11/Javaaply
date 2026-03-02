package fundamentojava;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        n.close();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.println(maior + " eh o maior");

    }

}