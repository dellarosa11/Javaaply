package fundamentojava;

import java.io.IOException;
import java.util.Scanner;


public class Esfera {
 
    public static void main(String[] args) throws IOException {
    	Scanner raio = new Scanner(System.in);
    	
    	double r = raio.nextDouble();
    	
    	double pi = 3.14159;
    	double volume = (4/3.0)*pi*Math.pow(r, 3);
    	raio.close();
    	
    	
        System.out.printf("VOLUME = %.3f", volume);
        System.out.println("");

    	
    }	
 
}