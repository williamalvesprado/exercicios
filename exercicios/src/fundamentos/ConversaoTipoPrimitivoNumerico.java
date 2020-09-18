package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		//Casting
		
		double a = 1; // conversão implicita (CAST)
		System.out.println(a);

		float b = (float) 1.0; // conversao explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // conversao explicita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;  // conversao explicita (CAST)
		System.out.println(f);
		

	}

}
