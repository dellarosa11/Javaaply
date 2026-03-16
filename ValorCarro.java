package fundamentojava;

public class ValorCarro {
    static void main() {
        double ValorCarro = 20000;
        for (int parcela = 1; parcela <= ValorCarro; parcela++) {
            double ValorParcela = ValorCarro / parcela;
            if (ValorParcela >= 1000) {
                System.out.println("Parcela" + parcela + "R$" + ValorParcela);
            }else{
                break;
            }

        }
    }
}
