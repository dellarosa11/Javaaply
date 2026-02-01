package fundamentojava;

public class TIpoString {
	public static void main(String[] args) {
		System.out.println("Olá mundo".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Matheus";
		var sobrenome = "Della Rosa";
		var idade = 21;
		var salario = 13520.647;

		System.out
				.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);

		System.out.printf("Nome: %s " + "\nSobrenome: %s " + "\nIdade: %d " + "\nSalario: %.2f", nome, sobrenome, idade,
				salario);

		String frase = String.format("Nome: %s " + "\nSobrenome: %s " + "\nIdade: %d " + "\nSalario: %.2f", nome,
				sobrenome, idade, salario);

		String maisUmaFrase = String.format(
				"Nome: %s " + "\nSobrenome: %s " + "\nIdade: %d " + "\nSalario: %.2f" + "\n", nome, sobrenome, idade,
				salario);

		System.out.println(maisUmaFrase);
		System.out.println(frase);
		System.out.println(maisUmaFrase);
		System.out.println("della rosa".contains("rosa"));
		System.out.println("della rosa".indexOf("rosa"));
		System.out.println("della rosa".substring(3));
		System.out.println("della rosa".substring(3,7));

	}
}
