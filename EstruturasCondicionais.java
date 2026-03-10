package fundamentojava;

import java.util.Scanner;

public class EstruturasCondicionais {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Quantos Anos você tem:  ");
        int idade = n.nextInt();
        n.close();
        boolean isIdadeMaior = idade >= 18;
        if (isIdadeMaior) {
            System.out.println("MAIOR DE IDADE");

        }
        if (!isIdadeMaior) {
            System.out.println("MENOR DE IDADE");

        }
        if (isIdadeMaior) {
            System.out.println("MAIOR DE IDADE");

        } else {
            System.out.println("MENOR DE IDADE");

        }
        double salario = 4000;

        String mensagemDoar = "DOAR PARA POBRES";
        String mensagemNaoDoar = "NAO DOAR";

        //String resultado = (condicao) ? verdadeiro:falso;
        String resultado = (salario < 3000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);


        System.out.println("FIM");
    }
}
