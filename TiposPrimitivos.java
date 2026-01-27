package fundamentojava;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;	//limite 128
		short numeroDeVoos = 32767;	//limite 32768
		int id = 214;		//limite 2147483648	
		long pontosAcumulados = 3_134_845_223L; //"L" no final para definir que eh maior que inteiro 
		long PontosAcumulados = 2_134_845_223;
		
		//Tipos numéricos reais
		float salario = 11_487.44F;//"F" no final para definir com float
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = false;//true
		char status = 'A';
		System.out.println(pontosAcumulados);
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Números de viagens 
		System.out.println(numeroDeVoos/2);

		//Pontos por real
		System.out.println(PontosAcumulados/vendasAcumuladas);
		System.out.println(id + " Ganha -> " + salario);
		System.out.println("Está de férias? -> " + estaDeFerias);
		System.out.println("Status: " + status);
		
		System.out.println("Matheus Della Rosa");
		
		
		
		
	
	
	
	
	
	}

}
