package fundamentojava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava {
    static void main() {
        //Exercicio de imposto - Países Baixos
        //Entre 0 a 34.712 - 9.70%
        //34.713 a 68.508 - 37.35%
        //Maior que 68.508 - 49.50%

        Scanner n = new Scanner(System.in);
        n.useLocale(Locale.US);
        System.out.println("Me Informe o salario: ");
        double salario = n.nextDouble();
        n.close();


        if (salario >= 0 && salario <= 34.712) {
            System.out.println("Aplica 9.70 de imposto");
        } else if (salario >= 34.713 && salario <= 68.507) {
            System.out.println("Aplica 37.35 de imposto");

        } else if (salario >= 68.508) {
            System.out.println("Aplica 49.50 de imposto");

        }


    }

}

