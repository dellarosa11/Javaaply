package fundamentojava;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {

    public static void main(String[] args) throws IOException {
    	
    	//Exercício 1002 - BeeCrowd
        //area = n*(raio*raio)

        double n = 3.14159;
        Scanner Raio = new Scanner(System.in);
        Raio.useLocale(Locale.US);

        double raio = Raio.nextDouble();
        double area = (n*(raio*raio));
        Raio.close();

        String frase = String.format("A="+"%.4f", area);


        System.out.println(frase);
    }

}