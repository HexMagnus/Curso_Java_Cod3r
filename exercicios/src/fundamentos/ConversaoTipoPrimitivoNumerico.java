package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float)1.12345; //explicita (CAST)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte)c; //explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; //explicita (CAST)
		System.out.println(f);
		
	}

}
