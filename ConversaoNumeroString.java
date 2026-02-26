package fundamentojava;

import javax.swing.JOptionPane;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		/*
		Integer num1 = 1000045454;
		System.out.println(num1.toString().length());
		
		int num2 = 100111;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		*/
		
		String A1 = JOptionPane.showInputDialog("Digite o Primeiro numero");
		String A2 = JOptionPane.showInputDialog("Digite o Segundo numero");
		//CONVERSÃO STRING -> NUMERO
		
		double B1 = Double.parseDouble(A1);
		double B2 = Double.parseDouble(A2);
		
		double soma = B1+B2;
		System.out.println(soma);
				
		
	}

}
