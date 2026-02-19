package fundamentojava;

public class ConversãoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);//maneira implicita
		
		
		float b = (float) 1.76468684; //explicita (CAST)
		System.out.println(b);
		
		int c= 345;
		byte d = (byte)c; //explicita (CAST)
		System.out.println(d);
		
		
		
		double e = 1.9999;//explicita (CAST)
		int f = (int) e;
		System.out.println(f);
		
	}

}
