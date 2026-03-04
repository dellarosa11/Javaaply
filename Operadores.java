package fundamentojava;

public class Operadores {
    static void main() {
        int idade = 29;
        float salario = 3580f;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.printf("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.printf("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupanca = 10000;

        float ValorPlay5 = 5000f;

        boolean isPlay5Compravel = ValorTotalContaCorrente >= ValorPlay5 || ValorTotalContaPoupanca >= ValorPlay5;
        System.out.printf("isPlay5Compravel:  " + isPlay5Compravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.printf("bonus: %.2f", bonus);

        int cont = 0;
        cont++;
        cont--;
        ++cont;
        --cont;
        System.out.printf("contador: %d", cont);

        int cont2 = 0;
        System.out.printf("cont2: %d", cont2++);

    }



}
