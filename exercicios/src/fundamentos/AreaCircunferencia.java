package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio =  3.4;
		final double PI = 3.14159;
	
		
		double area = PI * raio * raio;
		
		
		System.out.println(area);
		
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2.");
		
	}
	
}


//Variavel é: Tipo, nome e valor. Linha 6.Uma vez declarada, não é necessário declarar novamente.Bloco de linha 16.
//Constante: Adicionando final antes da variavel ela se torna uma constante. Constantes sempre tem as letra MAISCULAS.