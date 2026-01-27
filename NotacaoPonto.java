package fundamentojava;

public class NotacaoPonto {
	public static void main(String[] args) {
		String a = "Bom dia, X";
		a = a.replace("X", "Matheus");
		a = a.toUpperCase();
		a = a.concat("!!!");
		System.out.println(a);

		String b = "LETICIA".toLowerCase();
		System.out.println("Nome em minusculo " + b);
		
		String x = "boa tarde, x"
				.replace("x", b)
				.replace("tarde", "noite")
				.concat(" e Matheus!!")
				.toUpperCase();
		
		System.out.println(x);
		
		//tipos primitivos não tem "."
		
		int z = 3;
		System.out.println(z);
		
		
		

	}
}
