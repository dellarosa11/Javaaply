package fundamentojava;

public class EstruturasRepetition2 {
    static void main() {
        double ValorTotal = 42450;
        for (int parcela = (int)ValorTotal; parcela >= 1; parcela--) {
            double ValorParcela = ValorTotal / parcela;
            if (ValorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela" + parcela + "R$" + ValorParcela);

        }
    }
}
